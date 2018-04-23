package application.backend.services;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import application.backend.persistence.domain.backend.Plan;
import application.backend.persistence.domain.backend.User;
import application.backend.persistence.domain.backend.UserRole;
import application.backend.persistence.repositories.PlanRepository;
import application.backend.persistence.repositories.RoleRepository;
import application.backend.persistence.repositories.UserRepository;
import application.enums.PlansEnum;

@Service
//@Transactional(readOnly = true)
public class UserService {

	
	private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private UserRepository userRepository;

//    @Transactional
    public User createUser(User user, PlansEnum plansEnum, Set<UserRole> userRoles) {

        Plan plan = savePlan(plansEnum);

        user.setPlan(plan);

        saveUserRoles(userRoles);

        user.getUserRoles().addAll(userRoles);

        user = userRepository.save(user);

        log.debug("Saved User: " + user);
        log.debug("Users {}", userRepository.count());
        return user;

    }

	private void saveUserRoles(Set<UserRole> userRoles) {
		for (UserRole ur : userRoles) {
            roleRepository.save(ur.getRole());
        }
	}

	private Plan savePlan(PlansEnum plansEnum) {
		Plan plan = new Plan(plansEnum);
        
        // It makes sure the plans exist in the database
        if (!planRepository.existsById(plansEnum.getId())) {
            plan = planRepository.save(plan);
        }
		return plan;
	}
}

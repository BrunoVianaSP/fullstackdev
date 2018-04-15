package application.backend.services;

import org.springframework.transaction.annotation.Transactional;

import application.backend.persistence.domain.backend.Plan;
import application.backend.persistence.domain.backend.User;
import application.backend.persistence.domain.backend.UserRole;
import application.backend.persistence.repositories.PlanRepository;
import application.backend.persistence.repositories.RoleRepository;
import application.backend.persistence.repositories.UserRepository;
import application.enums.PlansEnum;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User createUser(User user, PlansEnum plansEnum, Set<UserRole> userRoles) {

        Plan plan = savePlan(plansEnum);

        user.setPlan(plan);

        saveUserRoles(userRoles);

        user.getUserRoles().addAll(userRoles);

        user = userRepository.save(user);

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

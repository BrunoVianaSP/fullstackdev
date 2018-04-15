package application.backend.persistence.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import application.backend.persistence.domain.backend.User;

 
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
}
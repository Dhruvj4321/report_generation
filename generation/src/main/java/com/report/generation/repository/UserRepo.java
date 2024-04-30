package com.report.generation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.report.generation.entities.User;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	
	Optional<User> findOneByEmailAndPassword(String email, String password);
	
	User findByEmail(String email);

}

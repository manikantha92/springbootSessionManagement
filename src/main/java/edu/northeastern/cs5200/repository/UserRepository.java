package edu.northeastern.cs5200.repository;

import org.springframework.data.repository.CrudRepository;

import edu.northeastern.cs5200.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByUsername(String username);
}

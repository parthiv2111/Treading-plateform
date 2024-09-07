package com.parthiv.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.parthiv.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}

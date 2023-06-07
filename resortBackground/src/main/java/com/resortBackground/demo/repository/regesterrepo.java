package com.resortBackground.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resortBackground.demo.Model.SignupData;

public interface regesterrepo extends JpaRepository<SignupData,String> {
	SignupData findByusername(String username);
//	Optional<User> findByUsername(String username);

}

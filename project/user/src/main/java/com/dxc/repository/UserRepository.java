package com.dxc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.UserThis;

@Repository
public interface UserRepository extends JpaRepository<UserThis, Integer> {

	Optional<UserThis> findByUserIdAndPassword(int userid,String password);
	
	
}

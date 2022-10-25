package com.spring.api.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.api.model.Users;

@Repository
public interface UserRepositoy extends JpaRepository<Users, Long>{

}

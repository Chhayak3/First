package com.fullstackprojects.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackprojects.fullstack.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}

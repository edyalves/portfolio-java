package com.edyco.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edyco.portfolio.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

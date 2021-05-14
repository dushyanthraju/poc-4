package com.xml.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.xml.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

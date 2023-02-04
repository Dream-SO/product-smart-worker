package com.dreamso.smartworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamso.smartworker.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}

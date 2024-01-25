package com.reverson.springsecurity6jwt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.reverson.springsecurity6jwt.model.User;

public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findByUsername(String username);
}

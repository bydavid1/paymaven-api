package com.paymaven.api.paymaven.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paymaven.api.paymaven.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  List<User> findAll();
} 
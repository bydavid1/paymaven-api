package com.paymaven.api.paymaven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paymaven.api.paymaven.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citius.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {

}

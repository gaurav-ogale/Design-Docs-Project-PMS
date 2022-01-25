package com.citius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citius.models.UserGroup;

public interface UserGroupRepository extends JpaRepository<UserGroup, Long>{

}

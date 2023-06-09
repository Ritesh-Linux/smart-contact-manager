package com.realtime.smartcontactmanager.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.realtime.smartcontactmanager.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findUserByEmail(String email);
}

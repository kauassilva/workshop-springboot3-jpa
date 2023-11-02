package com.kauadss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauadss.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

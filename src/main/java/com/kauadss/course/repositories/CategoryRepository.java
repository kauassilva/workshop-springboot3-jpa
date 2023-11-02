package com.kauadss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauadss.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package com.kauadss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kauadss.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

package com.parthiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parthiv.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}

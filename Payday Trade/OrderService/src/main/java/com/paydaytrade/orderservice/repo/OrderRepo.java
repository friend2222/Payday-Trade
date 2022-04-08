package com.paydaytrade.orderservice.repo;

import com.paydaytrade.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order , Long> {
List<Order> findAllByUserName(String username);
}

package com.paydaytrade.orderservice.controller;


import com.paydaytrade.orderservice.entity.Order;
import com.paydaytrade.orderservice.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/order")
public class OrderController {

    private final OrderService orderService ;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/buy-order")
    public ResponseEntity<Order> placeBuyOrder(@RequestBody Order order) {

     return ResponseEntity.ok(orderService.buyOrder(order));

    }

}

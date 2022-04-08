package com.paydaytrade.orderservice.service;


import com.paydaytrade.orderservice.entity.Order;

import java.util.List;

public interface OrderService {

    Order  buyOrder(Order order);
    Order sellOrder(Order order);

    List<Order> getOrderList(String userName);


}

package com.paydaytrade.orderservice.service;


import com.paydaytrade.orderservice.entity.Order;
import com.paydaytrade.orderservice.links.ServiceLinks;
import com.paydaytrade.orderservice.repo.OrderRepo;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final RestTemplate restTemplate;

    private final OrderRepo orderRepo;


    public OrderServiceImpl(RestTemplate restTemplate, OrderRepo orderRepo) {
        this.restTemplate = restTemplate;
        this.orderRepo = orderRepo;
    }

    @Override
    public Order buyOrder(Order order) {
//Get Stock Price
        order.setOrderType(0);
   JSONObject jsonObject = restTemplate.getForObject(ServiceLinks.STOCK_INFOMATION_GET.getLink(), JSONObject.class);

   BigDecimal stockPrice =BigDecimal.valueOf(Double.parseDouble(jsonObject.getString("stcockPrice")));

   if(order.getTargetPrice().compareTo(stockPrice) == -1 ){
       return  new Order();
   }else {
       //Send Rest Template request to user to lower balance
       //Then lower stock quantity by one
   }

//Compare current target price with current stock price

// If eligible then proceed else wait

return order;

    }

    @Override
    public Order sellOrder(Order order) {
       order.setOrderType(1);
        // Publish it into Stock List
        // Compae Target Price with sell price
        //If eligible then add cash into user balance delete stock from user
        return null;
    }

    @Override
    public List<Order> getOrderList(String userName) {
        return orderRepo.findAllByUserName(userName);
    }
}

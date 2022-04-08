package com.paydaytrade.orderservice.entity;




import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Order {
    @Id
    private Long orderId;

    private Long userName;

    private Long stockName;

    private BigDecimal targetPrice;

    @JsonIgnore
    private int orderType;

    public Order(){}

    public Order(Long orderId, Long userName, Long stockName, BigDecimal targetPrice ) {
        this.orderId = orderId;
        this.userName = userName;
        this.stockName = stockName;
        this.targetPrice = targetPrice;

    }

    public Long getOrderId() {
        return orderId;
    }

    public Order setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getUserName() {
        return userName;
    }

    public Order setUserName(Long userName) {
        this.userName = userName;
        return this;
    }

    public Long getStockName() {
        return stockName;
    }

    public Order setStockName(Long stockName) {
        this.stockName = stockName;
        return this;
    }

    public BigDecimal getTargetPrice() {
        return targetPrice;
    }

    public Order setTargetPrice(BigDecimal targetPrice) {
        this.targetPrice = targetPrice;
        return this;
    }

    public int getOrderType() {
        return orderType;
    }

    public Order setOrderType(int orderType) {
        this.orderType = orderType;
        return this;
    }
}

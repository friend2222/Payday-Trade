package com.paydaytrade.stockservice.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal stcockPrice;

    private String stockLogo;

    private String stcokName;

    public Stock() {
    }


    public Stock(Long id, BigDecimal stcockPrice, String stockLogo, String stcokName) {
        this.id = id;
        this.stcockPrice = stcockPrice;
        this.stockLogo = stockLogo;
        this.stcokName = stcokName;
    }

    public Long getId() {
        return id;
    }

    public Stock setId(Long id) {
        this.id = id;
        return this;
    }

    public BigDecimal getStcockPrice() {
        return stcockPrice;
    }

    public Stock setStcockPrice(BigDecimal stcockPrice) {
        this.stcockPrice = stcockPrice;
        return this;
    }

    public String getStockLogo() {
        return stockLogo;
    }

    public Stock setStockLogo(String stockLogo) {
        this.stockLogo = stockLogo;
        return this;
    }

    public String getStcokName() {
        return stcokName;
    }

    public Stock setStcokName(String stcokName) {
        this.stcokName = stcokName;
        return this;
    }
}

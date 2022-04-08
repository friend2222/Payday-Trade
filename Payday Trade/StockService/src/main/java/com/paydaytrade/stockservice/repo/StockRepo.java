package com.paydaytrade.stockservice.repo;

import com.paydaytrade.stockservice.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface StockRepo extends JpaRepository<Stock, Long> {
Stock findStockByStockName(String name);
BigDecimal findStockPriceByStockName(String name);
}

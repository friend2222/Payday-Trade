package com.paydaytrade.stockservice.service;

import com.paydaytrade.stockservice.entity.Stock;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface StockService {

List<Stock> getStockList();

Optional<Stock> getStock(String stockName);

Optional<BigDecimal> getStockPrice(String stockName);

Stock changeStockPrice(Stock stock);

}

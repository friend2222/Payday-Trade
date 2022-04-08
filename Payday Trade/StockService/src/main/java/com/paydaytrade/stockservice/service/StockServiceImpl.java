package com.paydaytrade.stockservice.service;

import com.paydaytrade.stockservice.entity.Stock;
import com.paydaytrade.stockservice.repo.StockRepo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService{

    private final StockRepo stockRepo;

    public StockServiceImpl(StockRepo stockRepo) {
        this.stockRepo = stockRepo;
    }


    @Override
    public List<Stock> getStockList() {
        return stockRepo.findAll();
    }

    @Override
    public Optional<Stock> getStock(String stockName) {
     return Optional.of(stockRepo.findStockByStockName(stockName));
    }

    @Override
    public Optional<BigDecimal> getStockPrice(String stockName) {

     return  Optional.of(stockRepo.findStockPriceByStockName(stockName));
    }

    @Override
    public Stock changeStockPrice(Stock stock) {
      return   stockRepo.save(stock);
    }
}

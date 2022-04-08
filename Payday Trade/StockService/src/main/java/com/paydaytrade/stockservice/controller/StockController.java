package com.paydaytrade.stockservice.controller;


import com.paydaytrade.stockservice.entity.Stock;
import com.paydaytrade.stockservice.service.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1`/stock")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/list-stock")
    public ResponseEntity<List<Stock>> getListOfStocks() {
        return ResponseEntity.ok(stockService.getStockList());
    }

    @GetMapping("/get-stock/{stockName}")
    public ResponseEntity<Stock> getStockByName(@PathVariable String stockName){
        return   ResponseEntity.ok(stockService.getStock(stockName).get());
    }

    @PostMapping("/update-stock")
    public ResponseEntity<Stock> updateStock(@RequestBody
                                                 @Valid
                                                 @NotNull Stock stock) {
        return ResponseEntity.ok(stockService.changeStockPrice(stock));
    }

}

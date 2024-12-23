package com.example.stock.service;

import com.example.stock.domain.Stock;
import com.example.stock.repository.StockRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    //@Transactional
    public synchronized void decreaseStock(Long id, Long quantity) {
        Stock stock = stockRepository.findById(id).orElseThrow();
        stock.decreaseQuantity(quantity);
        stockRepository.saveAndFlush(stock);
    }
}

package com.bielecki.bitbayclient.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class StockPriceService implements IStockDataService{

    @Autowired
    private IStockDataDAO dao;

    @Override
    public StockData create(StockData stockData) {
        return dao.save(stockData);
    }
}

package com.bielecki.bitbayclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IStockDataDAO extends JpaRepository<StockData,Integer> {

    StockData findByName(String name);

    @Query("select curr_name from stock_data where curr_name = :name")
    StockData retrieveByName(@Param("name") String name);
}

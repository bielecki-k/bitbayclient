package com.bielecki.bitbayclient.repository;

import javax.persistence.*;

@Entity
public class StockData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String curr_name;

    @Column
    private String date;

    @Column
    private int amount;

    @Column
    private int price_PLN;

    public StockData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurr_name() {
        return curr_name;
    }

    public void setCurr_name(String curr_name) {
        this.curr_name = curr_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice_PLN() {
        return price_PLN;
    }

    public void setPrice_PLN(int price_PLN) {
        this.price_PLN = price_PLN;
    }
}

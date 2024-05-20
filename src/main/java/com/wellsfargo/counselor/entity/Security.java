package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private LocalDateTime purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security() {

    }

    public Security(long portfolioId,String name, String category, Double price, LocalDateTime date, int quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        purchasePrice = price;
        purchaseDate = date;
        this.quantity = quantity;
    }

    //securityId getter
    public long getSecurityId() {
        return securityId;
    }
    //portfolioId getter/setter
    public long getPortfolioId() {
        return portfolioId;
    }
    public void setPortfolioId(long value) {
        portfolioId = value;
    }
    //name getter/setter
    public String getName() {
        return name;
    }
    public void setName(String value) {
        name = value;
    }
    //category getter/setter
    public String getCategory() {
        return category;
    }
    public void setCategory(String value) {
        category = value;
    }
    //price getter/setter
    public double getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(double value) {
        purchasePrice = value;
    }
    //purchase date getter/setter
    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(LocalDateTime value) {
        purchaseDate = value;
    }
    //quantity getter/setter
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int value) {
        quantity = value;
    }
}




























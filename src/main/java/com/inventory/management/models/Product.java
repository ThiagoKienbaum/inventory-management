package com.inventory.management.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="inventory")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private double cost;
    @Column(nullable = false)
    private int quantity;

    private int totalSold = 0;
    private double totalProfit = 0;

    public void addProductToInventory (int quantityToAdd) {
        this.quantity += quantityToAdd;
    }

    public void sellProduct (Sale sale) {
        if (this.quantity >= sale.getSoldQuantity()) {
            this.quantity -= sale.getSoldQuantity();
            this.totalSold += sale.getSoldQuantity();
            this.totalProfit = (sale.getPricePerProduct() - this.cost) * this.totalSold;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }
}

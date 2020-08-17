package com.inventory.management.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product xiaomiRedmi8;

    @BeforeEach
    public void setUp() {
        xiaomiRedmi8 = new Product("Xiaomi Redmi 8","smartphone",100.0,10);
    }

    @Test
    void successToAddProductToInventory() {
        xiaomiRedmi8.addProductToInventory(90);

        assertEquals(100, xiaomiRedmi8.getQuantity());
    }

    @Test
    void successToSellProduct() {
        Sale sale = new Sale(200.0,5);
        xiaomiRedmi8.sellProduct(sale);
        xiaomiRedmi8.sellProduct(sale);

        assertEquals(0, xiaomiRedmi8.getQuantity());
        assertEquals(10, xiaomiRedmi8.getTotalSold());
        assertEquals(1000, xiaomiRedmi8.getTotalProfit());
    }

    @Test
    void failToSellProduct() {
        Sale sale = new Sale(200.0,11);
        xiaomiRedmi8.sellProduct(sale);

        assertEquals(10, xiaomiRedmi8.getQuantity());
        assertEquals(0, xiaomiRedmi8.getTotalSold());
        assertEquals(0, xiaomiRedmi8.getTotalProfit());
    }
}
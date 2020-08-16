package com.inventory.management.models;

public class Sale {
    private double pricePerProduct;
    private int soldQuantity;

    public Sale(double pricePerProduct, int soldQuantity) {
        this.pricePerProduct = pricePerProduct;
        this.soldQuantity = soldQuantity;
    }

    public double getPricePerProduct() {
        return pricePerProduct;
    }

    public void setPricePerProduct(double pricePerProduct) {
        this.pricePerProduct = pricePerProduct;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }
}

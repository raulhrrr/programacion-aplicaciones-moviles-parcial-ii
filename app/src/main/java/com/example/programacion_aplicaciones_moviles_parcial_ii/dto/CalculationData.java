package com.example.programacion_aplicaciones_moviles_parcial_ii.dto;

import java.io.Serializable;

public class CalculationData implements Serializable {

    private final String productName;
    private final Integer productsQuantity;
    private final Double unitCost;

    public CalculationData(String productName, int productsQuantity, double unitCost) {
        this.productName = productName;
        this.productsQuantity = productsQuantity;
        this.unitCost = unitCost;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductsQuantity() {
        return productsQuantity;
    }

    public Double getUnitCost() {
        return unitCost;
    }

}

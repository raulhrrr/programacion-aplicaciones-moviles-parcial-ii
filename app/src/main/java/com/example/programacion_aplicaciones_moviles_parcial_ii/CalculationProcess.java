package com.example.programacion_aplicaciones_moviles_parcial_ii;

public class CalculationProcess {

    public static double calculateTotalCost(double unitCost, int productsQuantity) {
        return productsQuantity == 0 ? 0 : unitCost + calculateTotalCost(unitCost, productsQuantity - 1);
    }

    public static double calculateTotalCostWithTaxes(double unitCost, int productsQuantity) {
        return calculateTotalCost(unitCost, productsQuantity) * 1.19;
    }

}

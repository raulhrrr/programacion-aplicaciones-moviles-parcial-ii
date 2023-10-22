package com.example.programacion_aplicaciones_moviles_parcial_ii;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculationProcessTest {

    @Test
    public void whenProductsQuantityIsZero_thenResultIsZero() {
        assertEquals(0, CalculationProcess.calculateTotalCost(0, 0), 0);
    }

    @Test
    public void whenUnitCostIsZero_thenResultIsZero() {
        assertEquals(0, CalculationProcess.calculateTotalCost(0, 10), 0);
    }

    @Test
    public void calculateTotalCost() {
        assertEquals(100000, CalculationProcess.calculateTotalCost(100, 1000), 0);
    }

    @Test
    public void calculateTotalCostWithTaxes() {
        assertEquals(119000, CalculationProcess.calculateTotalCostWithTaxes(100, 1000), 0);
    }
}
package com.example.programacion_aplicaciones_moviles_parcial_ii;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.programacion_aplicaciones_moviles_parcial_ii.dto.CalculationData;

import java.text.DecimalFormat;
import java.util.Objects;

public class CalculationResult extends AppCompatActivity {

    DecimalFormat decimalFormat = new DecimalFormat("$###,###.###");

    @Override
    @SuppressLint("DefaultLocale")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_result);

        Intent intent = getIntent();
        CalculationData calculationData = (CalculationData) intent.getSerializableExtra("calculationData");

        TextView netTotal = findViewById(R.id.netTotal);
        String netTotalValue = decimalFormat.format(CalculationProcess.calculateTotalCost(Objects.requireNonNull(calculationData).getUnitCost(), calculationData.getProductsQuantity()));
        netTotal.setText(netTotalValue);

        TextView taxTotal = findViewById(R.id.taxTotal);
        String taxTotalValue = decimalFormat.format(CalculationProcess.calculateTotalCostWithTaxes(calculationData.getUnitCost(), calculationData.getProductsQuantity()));
        taxTotal.setText(taxTotalValue);

        TextView message = findViewById(R.id.message);
        message.setText(String.format(
                "La compra realizada para el producto %s con cantidad %d y costo unitario %s tiene un valor total de %s y un valor total con impuestos de %s",
                calculationData.getProductName(),
                calculationData.getProductsQuantity(),
                decimalFormat.format(calculationData.getUnitCost()),
                netTotalValue,
                taxTotalValue
        ));
    }
}
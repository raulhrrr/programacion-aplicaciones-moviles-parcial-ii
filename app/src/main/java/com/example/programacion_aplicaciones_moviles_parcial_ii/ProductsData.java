package com.example.programacion_aplicaciones_moviles_parcial_ii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.programacion_aplicaciones_moviles_parcial_ii.dto.CalculationData;

public class ProductsData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_data);

        Button btnCalculate = findViewById(R.id.calculate);
        btnCalculate.setOnClickListener(this::showCalculationResult);
    }

    protected void showCalculationResult(View view) {
        Intent intent = new Intent(getApplicationContext(), CalculationResult.class);

        TextView productName = findViewById(R.id.productName);
        TextView productQuantity = findViewById(R.id.productQuantity);
        TextView unitCost = findViewById(R.id.unitCost);

        CalculationData calculationData = new CalculationData(
                productName.getText().toString(),
                Integer.parseInt(productQuantity.getText().toString()),
                Double.parseDouble(unitCost.getText().toString())
        );

        intent.putExtra("calculationData", calculationData);
        startActivity(intent);
    }

}
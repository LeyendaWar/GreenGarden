package com.example.greengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView salir;
    Button consejo;
    Button Categoria;
    Button Estadisticas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        salir = findViewById(R.id.ExitH);
        consejo = findViewById(R.id.BTConsejo);
        Categoria = findViewById(R.id.BTCategory);
        Estadisticas = findViewById(R.id.BTStatics);

        Intent exit=new Intent(this, LoginActivity.class);
        Intent category = new Intent(this, CategoryActivity.class);
        Intent consejos = new Intent(this, AdviceActivity.class);
        Intent estadistic = new Intent(this, StatisticsActivity.class);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(exit);
            }
        });

        consejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(consejos);
            }
        });

        Categoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(category);
            }
        });

        Estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(estadistic);
            }
        });
    }
}
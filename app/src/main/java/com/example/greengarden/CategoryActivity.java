package com.example.greengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {

    ImageView salir;
    ImageView casa;
    Button Agua;
    Button Abono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        salir = findViewById(R.id.ExitH);
        casa = findViewById(R.id.IVhomeC);
        Abono = findViewById(R.id.BTAbonoC);
        Agua = findViewById(R.id.BTAguaC);

        Intent exit=new Intent(this, LoginActivity.class);
        Intent principal = new Intent(this, HomeActivity.class);
        Intent Categoria1= new Intent(this, Register1Activity.class);
        Intent Categoria2 = new Intent(this, Register2Activity.class);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(exit);
            }
        });

        casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(principal);
            }
        });

        Abono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Categoria2);
            }
        });

        Agua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Categoria1);
            }
        });


    }
}
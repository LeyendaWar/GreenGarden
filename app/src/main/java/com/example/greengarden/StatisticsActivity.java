package com.example.greengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StatisticsActivity extends AppCompatActivity {

    ImageView Salir;
    ImageView casa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        Salir = findViewById(R.id.ExitH);
        casa = findViewById(R.id.IVHomePrin2);

        Intent exit=new Intent(this, LoginActivity.class);
        Intent principal = new Intent(this, HomeActivity.class);

        Salir.setOnClickListener(new View.OnClickListener() {
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
    }
}
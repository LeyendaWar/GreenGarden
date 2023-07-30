package com.example.greengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Register2Activity extends AppCompatActivity {

    ImageView Salir;
    ImageView casa;
    ImageButton Safe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        Salir = findViewById(R.id.ExitH);
        casa = findViewById(R.id.IVHomePrin2);
        Safe = findViewById(R.id.IBSaveC2);

        Intent exit=new Intent(this, LoginActivity.class);
        Intent principal = new Intent(this, HomeActivity.class);
        Intent guardado = new Intent(this, CategoryActivity.class);

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

        Safe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(guardado);
            }
        });
    }
}
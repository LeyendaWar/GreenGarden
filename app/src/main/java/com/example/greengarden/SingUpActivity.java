package com.example.greengarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingUpActivity extends AppCompatActivity {

    Button create;

    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        create = findViewById(R.id.BTContinueSU);
        login = findViewById(R.id.TVLogin);

        Intent home=new Intent(this, HomeActivity.class);
        Intent SingUp= new Intent(this, LoginActivity.class);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(home);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(SingUp);
            }
        });
    }
}
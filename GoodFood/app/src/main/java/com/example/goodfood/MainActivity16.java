package com.example.goodfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity16 extends AppCompatActivity {

    Button btnontheway;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        initview();
    }

    private void initview() {

        btnontheway = findViewById(R.id.btnontheway);
        btnontheway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity16.this, MainActivity17.class);
                startActivity(i);
            }
        });
    }
}
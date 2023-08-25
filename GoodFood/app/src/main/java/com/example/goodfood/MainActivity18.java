package com.example.goodfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity18 extends AppCompatActivity {

    Button btntrack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        initview();{

        }
    }

    private void initview() {
        btntrack = findViewById(R.id.btntrack);
        btntrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity18.this, MainActivity19.class);
                startActivity(i);
            }
        });
    }
}
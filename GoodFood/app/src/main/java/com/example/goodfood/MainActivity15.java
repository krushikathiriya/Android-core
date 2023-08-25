package com.example.goodfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity15 extends AppCompatActivity {

    Button btntrack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        initview();{
    }
}

    private void initview() {
        btntrack = findViewById(R.id.btntrack);
        btntrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity15.this, MainActivity16.class);
                startActivity(i);
            }
        });
    }
    }
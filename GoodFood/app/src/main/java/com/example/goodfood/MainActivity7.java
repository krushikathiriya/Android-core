package com.example.goodfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    Button btnconfirmorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        initview();{
    }
}

    private void initview() {
        btnconfirmorder = findViewById(R.id.btnconfirmorder);

        btnconfirmorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity7.this, MainActivity11.class);
                startActivity(i);
            }
        });
    }
    }
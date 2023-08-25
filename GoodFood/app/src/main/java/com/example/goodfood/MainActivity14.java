package com.example.goodfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity14 extends AppCompatActivity {

    Button btnclocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        initview();{
    }
}

    private void initview() {
        btnclocation = findViewById(R.id.btnclocation);

        btnclocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity14.this, MainActivity15.class);
                startActivity(i);
            }
        });
    }
}
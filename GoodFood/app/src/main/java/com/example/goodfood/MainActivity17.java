package com.example.goodfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity17 extends AppCompatActivity {

    LinearLayout discover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        initview();{
    }
}

    private void initview() {
        discover = findViewById(R.id.discover);

        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity17.this, MainActivity18.class);
                startActivity(i);
            }
        });
    }
    }
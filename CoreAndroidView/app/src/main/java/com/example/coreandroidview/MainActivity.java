package com.example.coreandroidview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox pizza, coffee, burger;
    Button buttonOrder,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza = (CheckBox) findViewById(R.id.checkBox);
        coffee = (CheckBox) findViewById(R.id.checkbox1);
        burger = (CheckBox) findViewById(R.id.checkBox2);
        buttonOrder = (Button) findViewById(R.id.button1);
        next = (Button)findViewById(R.id.next);

        initview();
    }

    private void initview() {

        buttonOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (pizza.isChecked()) {
                    Toast.makeText(getApplicationContext(), "pizza is checked", Toast.LENGTH_SHORT).show();

                }
                if (coffee.isChecked()) {
                    Toast.makeText(getApplicationContext(), "coffee is checked", Toast.LENGTH_LONG).show();

                }
                if (burger.isChecked()) {
                    Toast.makeText(getApplicationContext(), "burger is checked", Toast.LENGTH_LONG).show();

                }
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(i);
                    }
                });
            }
        });
    }
}
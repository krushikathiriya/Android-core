package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView r1,text2,text3;
    EditText e1,e2,e3;

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        init();
    }
    private void init() {

        r1 = findViewById(R.id.reset);
        e1 = findViewById(R.id.edt1);
        e2 = findViewById(R.id.edt2);
        e3 = findViewById(R.id.edt3);
        b1 = findViewById(R.id.btn1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);


        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                e1.setText(" ");
                e2.setText(" ");
                e3.setText(" ");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            private double emi;

            @Override
            public void onClick(View view) {

                String loan = e1.getText().toString();
                String rate = e2.getText().toString();
                String time = e3.getText().toString();
                
                float p = Float.parseFloat(loan);
                float r = Float.parseFloat(rate)/100;
                int   t = Integer.parseInt(time);
                
                float emi = (float) (p*r*(Math.pow((1+r),t))/(Math.pow((1+r),t)-1));
                text2.setText(String.valueOf(emi));

                float e = emi/12;
                text3.setText(String.valueOf(e));
            }
        });
       }
    }



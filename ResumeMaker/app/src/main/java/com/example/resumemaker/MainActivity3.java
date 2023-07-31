package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView txtname,txtemail,txtmobileno,txtaddress,txtbirthdate,txtlanguages,txteducation,txtdetails,txtexperience,txtskills;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        init();
    }
    private void init()
    {
        txtname = findViewById(R.id.txtname);
        txtemail = findViewById(R.id.txtemail);
        txtmobileno = findViewById(R.id.txtmobileno);
        txtaddress = findViewById(R.id.txtaddress);
        txtbirthdate = findViewById(R.id.txtbirthdate);
        txtlanguages = findViewById(R.id.txtlanguages);
        txteducation = findViewById(R.id.txteducation);
        txtskills = findViewById(R.id.txtskills);
        txtdetails = findViewById(R.id.txtdetails);
        txtexperience = findViewById(R.id.txtexperience);

        if (getIntent()!=null)
        {
            txtname.setText(getIntent().getStringExtra("name"));
            txtemail.setText(getIntent().getStringExtra("email"));
            txtmobileno.setText(getIntent().getStringExtra("mobileno"));
            txtaddress.setText(getIntent().getStringExtra("address"));
            txtbirthdate.setText(getIntent().getStringExtra("birthdate"));
            txtlanguages.setText(getIntent().getStringExtra("languages"));
            txteducation.setText(getIntent().getStringExtra("education"));
            txtdetails.setText(getIntent().getStringExtra("details"));
            txtskills.setText(getIntent().getStringExtra("Skills"));
            txtexperience.setText(getIntent().getStringExtra("experience"));

        }

        }
    }
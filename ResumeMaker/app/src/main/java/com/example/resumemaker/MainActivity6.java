package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    TextView txtname, txtemail, txtmobileno, txtaddress, txtbirthdate, txtdetails, txteducation, txtexperience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        init();
    }

    private void init() {


        txtname = findViewById(R.id.txtname);
        txtemail = findViewById(R.id.txtemail);
        txtmobileno = findViewById(R.id.txtmobileno);
        txtaddress = findViewById(R.id.txtaddress);
        txtbirthdate = findViewById(R.id.txtbirthdate);
        txtdetails = findViewById(R.id.txtdetails);
        txteducation = findViewById(R.id.txteducation);
        txtexperience = findViewById(R.id.txtexperience);

        txtname.setText(getIntent().getStringExtra("name"));
        txtemail.setText(getIntent().getStringExtra("email"));
        txtmobileno.setText(getIntent().getStringExtra("mobileno"));
        txtaddress.setText(getIntent().getStringExtra("address"));
        txtbirthdate.setText(getIntent().getStringExtra("birthdate"));
        txtdetails.setText(getIntent().getStringExtra("details"));
        txteducation.setText(getIntent().getStringExtra("education"));
        txtexperience.setText(getIntent().getStringExtra("experience"));
    }
}
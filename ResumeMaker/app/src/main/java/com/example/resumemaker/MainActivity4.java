package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView txtname,txtmobileno,txtemail,txtlanguages,txtskills,txteducation,txtexperience,txthobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        init();
    }
    private void init()
    {
        txtname = findViewById(R.id.txtname);
        txtmobileno = findViewById(R.id.txtmobileno);
        txtemail = findViewById(R.id.txtemail);
        txtlanguages = findViewById(R.id.txtlanguages);
        txtskills = findViewById(R.id.txtskills);
        txteducation = findViewById(R.id.txteducation);
        txtexperience = findViewById(R.id.txtexperience);
        txthobby = findViewById(R.id.txthobby);

        if (getIntent()!=null)
        {
            txtname.setText(getIntent().getStringExtra("name"));
            txtmobileno.setText(getIntent().getStringExtra("mobileno"));
            txtemail.setText(getIntent().getStringExtra("email"));
            txtlanguages.setText(getIntent().getStringExtra("languages"));
            txtskills.setText(getIntent().getStringExtra("Skills"));
            txteducation.setText(getIntent().getStringExtra("education"));
            txtexperience.setText(getIntent().getStringExtra("experience"));
            txthobby.setText(getIntent().getStringExtra("hobby"));
        }
    }
}
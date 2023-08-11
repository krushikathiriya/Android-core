package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity7 extends AppCompatActivity {

    ImageView img1,img2,img3,img4;

    String name,email,mobileno,address,birthdate,education,languages,exp,details,skills,hobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


    init();
}
    private void init(){


        if (getIntent()!=null)
        {
            name = getIntent().getStringExtra("name");
            email = getIntent().getStringExtra("email");
            mobileno = getIntent().getStringExtra("mobileno");
            address = getIntent().getStringExtra("address");
            birthdate = getIntent().getStringExtra("birthdate");
            education = getIntent().getStringExtra("education");
            languages = getIntent().getStringExtra("languages");
            exp = getIntent().getStringExtra("experience");
            details = getIntent().getStringExtra("details");
            skills = getIntent().getStringExtra("Skills");
            hobby = getIntent().getStringExtra("hobby");


        }

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity7.this,MainActivity3.class);

                i.putExtra("name",name);
                i.putExtra("email",email);
                i.putExtra("mobileno",mobileno);
                i.putExtra("address",address);
                i.putExtra("birthdate",birthdate);
                i.putExtra("education",education);
                i.putExtra("languages",languages);
                i.putExtra("experience",exp);
                i.putExtra("details",details);
                i.putExtra("Skills",skills);
                i.putExtra("hobby", hobby);

                startActivity(i);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity7.this, MainActivity4.class);
                i.putExtra("name",name);
                i.putExtra("email",email);
                i.putExtra("mobileno",mobileno);
                i.putExtra("address",address);
                i.putExtra("birthdate",birthdate);
                i.putExtra("education",education);
                i.putExtra("languages",languages);
                i.putExtra("experience",exp);
                i.putExtra("details",details);
                i.putExtra("Skills",skills);
                i.putExtra("hobby", hobby);

                startActivity(i);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity7.this, MainActivity5.class);

                i.putExtra("name",name);
                i.putExtra("email",email);
                i.putExtra("mobileno",mobileno);
                i.putExtra("address",address);
                i.putExtra("birthdate",birthdate);
                i.putExtra("education",education);
                i.putExtra("languages",languages);
                i.putExtra("experience",exp);
                i.putExtra("details",details);
                i.putExtra("Skills",skills);
                i.putExtra("hobby", hobby);


                startActivity(i);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity7.this, MainActivity6.class);

                i.putExtra("name",name);
                i.putExtra("email",email);
                i.putExtra("mobileno",mobileno);
                i.putExtra("address",address);
                i.putExtra("birthdate",birthdate);
                i.putExtra("education",education);
                i.putExtra("languages",languages);
                i.putExtra("experience",exp);
                i.putExtra("details",details);
                i.putExtra("Skills",skills);
                i.putExtra("hobby", hobby);

                startActivity(i);
            }
        });
    }
}
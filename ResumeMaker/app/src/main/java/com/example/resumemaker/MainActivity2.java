package com.example.resumemaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    EditText edtname, edtemail, edtmobileno, edtaddress, edtbirthdate, edteducation, edtlang, edtexperience, edtdetails, edtskills;

    CheckBox cbsinging, cbreading, cbdansing, cbart;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();
    }

    private void init() {

        edtname = findViewById(R.id.edtname);
        edtemail = findViewById(R.id.edtemail);
        edtmobileno = findViewById(R.id.edtmobileno);
        edtaddress = findViewById(R.id.edtaddress);
        edtbirthdate = findViewById(R.id.edtbirthdate);
        edtexperience = findViewById(R.id.edtexperience);
        edtdetails = findViewById(R.id.edtdetails);
        edtskills = findViewById(R.id.edtskills);
        edteducation = findViewById(R.id.edteducation);
        edtlang = findViewById(R.id.edtlang);
        btn = findViewById(R.id.btn);


//            checkbox
        cbsinging = findViewById(R.id.cbsinging);
        cbreading = findViewById(R.id.cbreading);
        cbdansing = findViewById(R.id.cbdansing);
        cbart = findViewById(R.id.cbart);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String hobby = null;

                if (cbsinging.isChecked()) {
                    hobby  = cbsinging.getText().toString() + "\n";
                }
                if (cbreading.isChecked()) {
                    hobby += cbreading.getText().toString() + "\n";
                }
                if (cbdansing.isChecked()) {
                    hobby += cbdansing.getText().toString() + "\n";
                }
                if (cbart.isChecked()) {
                    hobby += cbart.getText().toString() + "\n";
                }


                String name = edtname.getText().toString();
                String mail = edtemail.getText().toString();
                String no = edtmobileno.getText().toString();
                String add = edtaddress.getText().toString();
                String date = edtbirthdate.getText().toString();
                String exp = edtexperience.getText().toString();
                String det = edtdetails.getText().toString();
                String ski = edtskills.getText().toString();
                String edu = edteducation.getText().toString();
                String lan = edtlang.getText().toString();
                String hob = cbsinging.getText().toString();



                Intent i = new Intent(MainActivity2.this, MainActivity7.class);

                i.putExtra("name", name);
                i.putExtra("email", mail);
                i.putExtra("mobileno", no);
                i.putExtra("address", add);
                i.putExtra("details", det);
                i.putExtra("birthdate", date);
                i.putExtra("experience", exp);
                i.putExtra("education", edu);
                i.putExtra("languages", lan);
                i.putExtra("Skills", ski);
                i.putExtra("hobby", hobby);


                startActivity(i);
            }
        });
    }
}


package com.example.coreandroidview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    RadioButton radiobutton1, radiobutton2, radiobutton3, radiobutton4;

    Button button2,nextclick;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


            radiobutton1 = findViewById(R.id.radiobutton1);
            radiobutton2 = findViewById(R.id.radiobutton2);
            radiobutton3 = findViewById(R.id.radiobutton3);
            radiogroup = findViewById(R.id.radiogroup);
            radiobutton4 = findViewById(R.id.radiobutton4);
            button2 = findViewById(R.id.button2);
            nextclick = findViewById(R.id.nextclick);

            radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {


                    if (radiobutton1.isChecked()) {
                        Toast.makeText(getApplicationContext(), "java", Toast.LENGTH_SHORT).show();
                    }
                    if (radiobutton2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Python", Toast.LENGTH_SHORT).show();
                    }
                    if (radiobutton3.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_SHORT).show();
                    }
                    if (radiobutton4.isChecked()) {
                        Toast.makeText(getApplicationContext(), "Webdesign", Toast.LENGTH_SHORT).show();
                    }
                }
            });


           nextclick.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                   Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                   startActivity(i);

               }
           });
    }

}


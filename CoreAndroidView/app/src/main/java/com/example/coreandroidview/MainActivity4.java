package com.example.coreandroidview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button click1,click2,click3,click4,btn2;

    String url1 = "https://www.dailymotion.com/video/x3c7lla";
    String url2 = "https://www.youtube.com/watch?v=9S0Ws-lQJsI";
    String url3 = "https://www.youtube.com/";
    String utl4 = "https://mrdoob.com/projects/chromeexperiments/google-gravity/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        initview();
    }

    private void initview() {


        click1 = findViewById(R.id.click1);
        click2 = findViewById(R.id.click2);
        click3 = findViewById(R.id.click3);
        click4 = findViewById(R.id.click4);
        btn2 = findViewById(R.id.btn2);
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
                startActivity(i);

            }

        });
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse(url2));
                startActivity(i);
            }
        });
        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse(url3));
                startActivity(i);
            }
        });
        click4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse(utl4));
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(i);
            }
        });
    }

}
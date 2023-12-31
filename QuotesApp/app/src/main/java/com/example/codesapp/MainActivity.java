package com.example.codesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView g1;

    ArrayList<Modelclass> QuotesName = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {

        Modelclass m1 = new Modelclass();
        m1.setQuotesName("Happy");
        m1.setQuotesImg(R.drawable.happyy);
        QuotesName.add(m1);

        Modelclass m2 = new Modelclass();
        m2.setQuotesName("Sad");
        m2.setQuotesImg(R.drawable.sad);
        QuotesName.add(m2);

        Modelclass m3 = new Modelclass();
        m3.setQuotesName("Engry");
        m3.setQuotesImg(R.drawable.engry);
        QuotesName.add(m3);

        Modelclass m4 = new Modelclass();
        m4.setQuotesName("Confused");
        m4.setQuotesImg(R.drawable.confused);
        QuotesName.add(m4);

        Modelclass m5 = new Modelclass();
        m5.setQuotesName("Love");
        m5.setQuotesImg(R.drawable.love);
        QuotesName.add(m5);

        Modelclass m6 = new Modelclass();
        m6.setQuotesName("Brother");
        m6.setQuotesImg(R.drawable.brother);
        QuotesName.add(m6);

        Modelclass m7 = new Modelclass();
        m7.setQuotesName("Teacher");
        m7.setQuotesImg(R.drawable.teacher);
        QuotesName.add(m7);

        Modelclass m8 = new Modelclass();
        m8.setQuotesName("Friendship");
        m8.setQuotesImg(R.drawable.frienship);
        QuotesName.add(m8);

        Modelclass m9 = new Modelclass();
        m9.setQuotesName("Education");
        m9.setQuotesImg(R.drawable.education);
        QuotesName.add(m9);

        Modelclass m10 = new Modelclass();
        m10.setQuotesName("Positive");
        m10.setQuotesImg(R.drawable.positive);
        QuotesName.add(m10);

        Modelclass m11 = new Modelclass();
        m11.setQuotesName("Money");
        m11.setQuotesImg(R.drawable.money);
        QuotesName.add(m11);

        Modelclass m12 = new Modelclass();
        m12.setQuotesName("Nature");
        m12.setQuotesImg(R.drawable.nature);
        QuotesName.add(m12);


        Modelclass m13 = new Modelclass();
        m13.setQuotesName("Attitude");
        m13.setQuotesImg(R.drawable.attitude);
        QuotesName.add(m13);

        Modelclass m14 = new Modelclass();
        m14.setQuotesName("Alone");
        m14.setQuotesImg(R.drawable.alone);
        QuotesName.add(m14);

        Modelclass m15 = new Modelclass();
        m15.setQuotesName("Confidence");
        m15.setQuotesImg(R.drawable.confidence);
        QuotesName.add(m15);

        Modelclass m16 = new Modelclass();
        m16.setQuotesName("Inspiration");
        m16.setQuotesImg(R.drawable.inspiration);
        QuotesName.add(m16);

        Modelclass m17 = new Modelclass();
        m17.setQuotesName("Life");
        m17.setQuotesImg(R.drawable.life);
        QuotesName.add(m17);

        Modelclass m18 = new Modelclass();
        m18.setQuotesName("Beautiful");
        m18.setQuotesImg(R.drawable.beautiful);
        QuotesName.add(m18);

        Modelclass m19 = new Modelclass();
        m19.setQuotesName("Dream");
        m19.setQuotesImg(R.drawable.dream);
        QuotesName.add(m19);

        Modelclass m20 = new Modelclass();
        m20.setQuotesName("Motivation");
        m20.setQuotesImg(R.drawable.motivation);
        QuotesName.add(m20);

        QuotesInterface quotesInterface = new QuotesInterface() {
          @Override
          public void Quotes(String Quotes) {

              Intent i = new Intent(MainActivity.this,MainActivity2.class);
              i.putExtra("Quotes",Quotes);
              startActivity(i);

          }
      };

        g1=findViewById(R.id.g1);

        GridLayoutManager manager = new GridLayoutManager(MainActivity.this,2,GridLayoutManager.VERTICAL,false);
        RecycleviewArrayAdpter adpter = new RecycleviewArrayAdpter(MainActivity.this,QuotesName,quotesInterface);
        g1.setLayoutManager(manager);
        g1.setAdapter(adpter);

    }
}
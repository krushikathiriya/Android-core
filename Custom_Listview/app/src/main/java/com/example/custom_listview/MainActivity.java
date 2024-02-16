package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView customlistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {
        customlistview = findViewById(R.id.customlistview);


        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> img = new ArrayList<>();

        name.add("Father");
        name.add("Mother");
        name.add("Brother");
        name.add("Sister");
        name.add("GrandFather");
        name.add("GrandMother");
        name.add("Aunty");
        name.add("Uncle");
        name.add("Mother-in-law");
        name.add("Sister-in-law");
        name.add("Fuva");
        name.add("Fiya");
        name.add("Dada");
        name.add("Dadi");


        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);
        img.add(R.drawable.family);

        name.get(0);
        name.get(1);
        name.get(2);
        name.get(3);
        name.get(4);
        name.get(5);
        name.get(6);
        name.get(7);
        name.get(8);
        name.get(9);
        name.get(10);
        name.get(11);
        name.get(12);


        img.get(0);
        img.get(1);
        img.get(2);
        img.get(3);
        img.get(4);
        img.get(5);
        img.get(6);
        img.get(7);
        img.get(8);
        img.get(9);
        img.get(10);
        img.get(11);
        img.get(12);

        ArrayListAdepter adepter = new ArrayListAdepter(this,name,img);
        customlistview.setAdapter(adepter);
    }
}
package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String name[]={"Papa","Maa","Brother","Sister","Aunty","Uncle","Grandfather","Grandmother"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom);
        initview();{
    }
}


    private void initview() {
        listView = findViewById(R.id.listview);



        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,R.layout.main_item_file,R.id.textView,name);

        listView.setAdapter(adapter);

    }
    }
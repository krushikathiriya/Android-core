package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class simpallistview extends AppCompatActivity {

    ListView simpallistview;

    String name[]={"Papa","Maa","Brother","sister","Uncle","Aunty","Grandfather"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpallistview);
        initview();{
    }
}

    private void initview() {

        simpallistview = findViewById(R.id.simpallistview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.main_item_file,R.id.textView,name);

        simpallistview.setAdapter(adapter);
    }
    }
package com.example.gridview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String name[] = {"Papa", "Maa", "Brother", "sister", "Uncle", "Aunty", "Grandfather"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        {
        }
    }

    private void initview() {
        gridView = findViewById(R.id.gridview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item_file, R.id.txtname, name);

        gridView.setAdapter(adapter);
    }
}
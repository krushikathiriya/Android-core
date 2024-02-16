package com.example.popup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BrodcastActivity extends AppCompatActivity {

    ListView listviewrelative;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brodcast);
        initview();
    }

    private void initview() {

        listviewrelative = findViewById(R.id.listviewrelative);

        ArrayList<String> name=new ArrayList<>();
        ArrayList<Integer> img=new ArrayList<>();

        name.add("Papa😍");
        name.add("Mummy❤️");
        name.add("Krushit Bhai🙄🙄");
        name.add("Romit Bhai🙄🙄");
        name.add("Ruju betstuu🫶❤️🤝‍");
        name.add("Sanju savaj🤪");
        name.add("Sanju 2🌸");
        name.add("Ayushi");
        name.add("Krupa🫶");
        name.add("Harshita❤️");
        name.add("Janvi❤️");
        name.add("Jayshre mami❤️");
        name.add("Sonal mami❤️");
        name.add("Rita mami");
        name.add("Haresh mama");
        name.add("Jatin mama");
        name.add("Kishor mama");
        name.add("Jeniiii😥😥");
        name.add("Kenil Bhai");
        name.add("Zakhiii😥");
        name.add("Ruchita Aunty🫶");
        name.add("Alpesh Uncle🫶");
        name.add("Asha fiya🫶");
        name.add("Isha🌸");

        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);
        img.add(R.drawable.person);

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
        name.get(13);
        name.get(14);
        name.get(15);
        name.get(16);
        name.get(17);
        name.get(18);
        name.get(19);
        name.get(20);
        name.get(21);
        name.get(22);

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
        img.get(13);
        img.get(14);
        img.get(15);
        img.get(16);
        img.get(17);
        img.get(18);
        img.get(19);
        img.get(20);
        img.get(21);
        img.get(22);

        broadcastArraylistAdepter adepter =new broadcastArraylistAdepter(this,name,img);
        listviewrelative.setAdapter(adepter);
    }
}
package com.example.popup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
    }

    private void initview() {
        imageview = findViewById(R.id.imageview);
        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, imageview);

                popupMenu.getMenuInflater().inflate(R.menu.item, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if (menuItem.getItemId()==R.id.newgroup)
                        {
                            Intent i = new Intent(MainActivity.this, NewgroupActivity.class);
                            startActivity(i);
                        }
                        if (menuItem.getItemId()==R.id.broad)
                        {
                            Intent i = new Intent(MainActivity.this,BrodcastActivity.class);
                            startActivity(i);
                        }
                        if (menuItem.getItemId()==R.id.linked)
                        {
                            Intent i = new Intent(MainActivity.this, LinkeddevicesActivity.class);
                            startActivity(i);
                        }
                        if (menuItem.getItemId()==R.id.starred)
                        {
                            Intent i = new Intent(MainActivity.this, StarredMessagesActivity.class);
                            startActivity(i);
                        }
                        if (menuItem.getItemId()==R.id.payment)
                        {
                            Intent i = new Intent(MainActivity.this, PaymentsActivity.class);
                            startActivity(i);
                        }
                        if (menuItem.getItemId()==R.id.settings)
                        {
                            Intent i = new Intent(MainActivity.this, SettingActivity.class);
                            startActivity(i);
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });





    }
}

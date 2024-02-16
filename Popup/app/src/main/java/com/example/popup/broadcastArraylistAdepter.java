package com.example.popup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class broadcastArraylistAdepter extends BaseAdapter {
    BrodcastActivity brodcastActivity;
    ArrayList<String> name;
    ArrayList<Integer> img;
    public broadcastArraylistAdepter(BrodcastActivity brodcastActivity, ArrayList<String> name, ArrayList<Integer> img) {
        this.brodcastActivity = brodcastActivity;
        this.img = img;
        this.name = name;
    }

    @Override
    public int getCount() {
        return img.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(brodcastActivity).inflate(R.layout.broadcast_item_file,viewGroup,false);

        TextView txtname;
        ImageView img2;

        txtname = view.findViewById(R.id.txtname);
        img2 = view.findViewById(R.id.img2);

        txtname.setText(name.get(i));

        img2.setImageResource(img.get(i));

        return view;
    }
}

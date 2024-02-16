package com.example.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListAdepter extends BaseAdapter {

    MainActivity mainActivity;
    ArrayList<String> name;
    ArrayList<Integer> img;

    public ArrayListAdepter(MainActivity mainActivity, ArrayList<String> name, ArrayList<Integer> img) {
        this.mainActivity=mainActivity;
        this.name=name;
        this.img=img;
    }

    @Override
    public int getCount() {
        return name.size();
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

        view= LayoutInflater.from(mainActivity).inflate(R.layout.custom_listview_item_file,viewGroup,false);

        TextView txthello;
        ImageView img1;

        txthello = view.findViewById(R.id.txthello);
        img1 = view.findViewById(R.id.img1);

        txthello.setText(name.get(i));

       img1.setImageResource(img.get(i));
        return view;
    }
}

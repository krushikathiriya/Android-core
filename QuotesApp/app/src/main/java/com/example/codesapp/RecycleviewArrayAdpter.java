package com.example.codesapp;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleviewArrayAdpter extends RecyclerView.Adapter<RecycleviewArrayAdpter.MyViewHolder> {

    MainActivity mainActivity;

    ArrayList<Modelclass> arrayList;

    QuotesInterface quotesInterface;
    public RecycleviewArrayAdpter(MainActivity mainActivity, ArrayList<Modelclass> arrayList,QuotesInterface quotesInterface) {
        this.mainActivity=mainActivity;
        this.arrayList=arrayList;
        this.quotesInterface=quotesInterface;
    }

    @NonNull
    @Override
    public RecycleviewArrayAdpter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mainActivity).inflate(R.layout.item_file,parent,false);
        MyViewHolder m = new MyViewHolder(view);
        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleviewArrayAdpter.MyViewHolder holder, int position) {
      int i = position;

      holder.txthello.setText(arrayList.get(i).QuotesName);
      holder.img.setImageResource(arrayList.get(i).QuotesImg);

      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              quotesInterface.Quotes(arrayList.get(i).QuotesName);
          }
      });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txthello;

        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txthello = itemView.findViewById(R.id.txthello);
            img = itemView.findViewById(R.id.img);
        }
    }
}
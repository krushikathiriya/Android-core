package com.example.codesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuotesAdpeter extends RecyclerView.Adapter<QuotesAdpeter.MyViewHolder> {

    MainActivity2 mainActivity2;
    ArrayList<ModelclassQuotes> quotesName;

    public QuotesAdpeter(MainActivity2 mainActivity2, ArrayList<ModelclassQuotes> quotesName) {

        this.quotesName=quotesName;
        this.mainActivity2=mainActivity2;
    }

    @NonNull
    @Override
    public QuotesAdpeter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mainActivity2).inflate(R.layout.quotes_item_file, parent, false);
        MyViewHolder m = new MyViewHolder(view);
        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesAdpeter.MyViewHolder holder, int position) {

        holder.quotes.setText(quotesName.get(position).Quotes);
    }

    @Override
    public int getItemCount() {
        return quotesName.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView quotes;
        public MyViewHolder(@NonNull View view){

        super(view);
        quotes = view.findViewById(R.id.quotes);
    }
}
}

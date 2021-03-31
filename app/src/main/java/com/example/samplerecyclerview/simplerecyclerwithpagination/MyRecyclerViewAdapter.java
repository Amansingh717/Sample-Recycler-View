package com.example.samplerecyclerview.simplerecyclerwithpagination;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samplerecyclerview.R;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyRecyclerViewHolder> {

    private ArrayList<Double> arrayList = new ArrayList<>();

    void addData(ArrayList<Double> arrayList) {
        this.arrayList.addAll(arrayList);
    }

    void addPaginatedData(ArrayList<Double> paginatedArrayList) {
        this.arrayList.addAll(paginatedArrayList);
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_recycler_row_item, parent, false);
        return new MyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {
        holder.textView.setText(String.valueOf(arrayList.get(position)));
        holder.textViewIndex.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textViewIndex;

        MyRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.row_item_text);
            textViewIndex = itemView.findViewById(R.id.row_item_index);
        }
    }
}

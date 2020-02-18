package com.example.bootcamplayoutspart2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//This example will be using AsyncListDiffer with RecyclerView
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyRecyclerViewHolder> {

    private final AsyncListDiffer<DataSource.Data> mDiffer = new AsyncListDiffer<>(this, diffCallback);
    private static final DiffUtil.ItemCallback<DataSource.Data> diffCallback = new DiffUtil.ItemCallback<DataSource.Data>() {

        @Override
        public boolean areItemsTheSame(@NonNull DataSource.Data oldItem, @NonNull DataSource.Data newItem) {
            return oldItem.getId() == newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull DataSource.Data oldItem, @NonNull DataSource.Data newItem) {
            return oldItem.equals(newItem);
        }
    };

    public void submitList(ArrayList<DataSource.Data> arrayList) {
        mDiffer.submitList(arrayList);
    }

    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_item, parent, false);
        return new MyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {
        holder.textView.setText(String.valueOf(mDiffer.getCurrentList().get(position).getValue()));
        holder.textViewIndex.setText(String.valueOf(mDiffer.getCurrentList().get(position).getId()));
    }

    @Override
    public int getItemCount() {
        return mDiffer.getCurrentList().size();
    }

    class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textViewIndex;

        MyRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.row_item_text);
            textViewIndex = itemView.findViewById(R.id.row_item_text_index);
        }
    }
}

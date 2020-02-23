package com.example.bootcamplayoutspart2.simplerecyclerwithmultitype;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcamplayoutspart2.R;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<DataItem> arrayList = new ArrayList<>();

    void addData(ArrayList<DataItem> arrayList) {
        this.arrayList.addAll(arrayList);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == DataItem.ITEM_TYPE_0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.multitype_row_item_type0, parent, false);
            return new MyType0RecyclerViewHolder(view);
        } else if (viewType == DataItem.ITEM_TYPE_1) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.multitype_row_item_type1, parent, false);
            return new MyType1RecyclerViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.multitype_row_item_type2, parent, false);
            return new MyType2RecyclerViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        DataItem dataItem = arrayList.get(position);
        if (holder instanceof MyType0RecyclerViewHolder) {
            MyType0RecyclerViewHolder viewHolder = (MyType0RecyclerViewHolder) holder;

            viewHolder.imageView.setImageResource(dataItem.getItemImage());

        } else if (holder instanceof MyType1RecyclerViewHolder) {
            MyType1RecyclerViewHolder viewHolder = (MyType1RecyclerViewHolder) holder;

            viewHolder.textView.setText(dataItem.getItemText());
            viewHolder.imageView.setImageResource(dataItem.getItemImage());

        } else if (holder instanceof MyType2RecyclerViewHolder) {
            MyType2RecyclerViewHolder viewHolder = (MyType2RecyclerViewHolder) holder;

            viewHolder.textView.setText(dataItem.getItemText());
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return arrayList.get(position).getItemType();
    }


    class MyType0RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        MyType0RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view_type0);
        }
    }

    class MyType1RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        MyType1RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view_type1);
            imageView = itemView.findViewById(R.id.image_view_type1);
        }
    }

    class MyType2RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        MyType2RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view_type2);
        }
    }
}

package com.example.bootcamplayoutspart2.simplerecyclerwithmultitype;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
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
        if (viewType == DataItem.ITEM_TYPE_IMAGE_WITH_DESCRIPTION) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.multitype_row_item_type1, parent, false);
            return new MyType1RecyclerViewHolder(view);
        } else if (viewType == DataItem.ITEM_TYPE_IMAGE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.multitype_row_item_type2, parent, false);
            return new MyType2RecyclerViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.multitype_row_item_type3, parent, false);
            return new MyType3RecyclerViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyType1RecyclerViewHolder) {
            MyType1RecyclerViewHolder viewHolder = (MyType1RecyclerViewHolder) holder;
            DataItem dataItem = arrayList.get(position);
            viewHolder.textView.setText(dataItem.getTextDescription());
            Glide.with(viewHolder.itemView.getContext())
                    .load(dataItem.getTextImageUrl())
                    .into(viewHolder.imageView);

        } else if (holder instanceof MyType2RecyclerViewHolder) {
            MyType2RecyclerViewHolder viewHolder = (MyType2RecyclerViewHolder) holder;
            DataItem dataItem = arrayList.get(position);
            Glide.with(viewHolder.itemView.getContext())
                    .load(dataItem.getTextImageUrl())
                    .into(viewHolder.imageView);
        } else {
            MyType3RecyclerViewHolder viewHolder = (MyType3RecyclerViewHolder) holder;
            DataItem dataItem = arrayList.get(position);
            viewHolder.textView.setText(dataItem.getTextDescription());
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
        ImageView imageView;

        MyType2RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view_type2);
        }
    }

    class MyType3RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        MyType3RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view_type3);
        }
    }
}

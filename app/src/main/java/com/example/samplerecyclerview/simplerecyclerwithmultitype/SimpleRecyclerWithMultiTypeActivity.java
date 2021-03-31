package com.example.samplerecyclerview.simplerecyclerwithmultitype;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samplerecyclerview.R;

public class SimpleRecyclerWithMultiTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_recycler);

        //initialisation
        DataSource mDataSource = new DataSource();
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //fetching data
        myRecyclerViewAdapter.addData(mDataSource.getData());

        //setting recycler-view
        mRecyclerView.setAdapter(myRecyclerViewAdapter);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(false);
    }
}

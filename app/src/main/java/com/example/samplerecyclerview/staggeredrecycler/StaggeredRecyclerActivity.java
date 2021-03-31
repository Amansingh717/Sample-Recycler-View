package com.example.samplerecyclerview.staggeredrecycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.samplerecyclerview.R;

public class StaggeredRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_recycler);

        //initialisation
        DataSource mDataSource = new DataSource();
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter();
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);

        //fetching data
        myRecyclerViewAdapter.addData(mDataSource.getData());

        //setting recycler-view
        mRecyclerView.setAdapter(myRecyclerViewAdapter);
        mRecyclerView.setLayoutManager(layoutManager);
    }
}

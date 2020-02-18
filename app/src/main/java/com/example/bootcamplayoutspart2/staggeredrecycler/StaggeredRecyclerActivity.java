package com.example.bootcamplayoutspart2.staggeredrecycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.bootcamplayoutspart2.R;

public class StaggeredRecyclerActivity extends AppCompatActivity {

    private DataSource mDataSource;
    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter myRecyclerViewAdapter;
    private StaggeredGridLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_recycler);

        //initialisation
        mDataSource = new DataSource();
        mRecyclerView = findViewById(R.id.recycler_view);
        myRecyclerViewAdapter = new MyRecyclerViewAdapter();
        layoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);

        //fetching data
        myRecyclerViewAdapter.addData(mDataSource.getData());

        //setting recycler-view
        mRecyclerView.setAdapter(myRecyclerViewAdapter);
        mRecyclerView.setLayoutManager(layoutManager);
    }
}

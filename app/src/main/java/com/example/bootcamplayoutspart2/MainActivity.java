package com.example.bootcamplayoutspart2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private DataSource mDataSource;
    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter myRecyclerViewAdapter;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialisation
        mDataSource = new DataSource();
        mRecyclerView = findViewById(R.id.recycler_view);
        myRecyclerViewAdapter = new MyRecyclerViewAdapter();
        layoutManager = new LinearLayoutManager(this);

        //fetching data
        myRecyclerViewAdapter.addData(mDataSource.getData());

        //setting recycler-view
        mRecyclerView.setAdapter(myRecyclerViewAdapter);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(false);
    }
}

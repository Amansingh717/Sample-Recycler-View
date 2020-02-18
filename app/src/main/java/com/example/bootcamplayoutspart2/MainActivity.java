package com.example.bootcamplayoutspart2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialisation
        final DataSource mDataSource = new DataSource();
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //fetching data
        mDataSource.arrayListLiveData.observe(this, new Observer<ArrayList<DataSource.Data>>() {
            @Override
            public void onChanged(ArrayList<DataSource.Data> data) {
                myRecyclerViewAdapter.submitList(data);
            }
        });


        //setting recycler-view
        mRecyclerView.setAdapter(myRecyclerViewAdapter);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(false);

        Button buttonFetchData = findViewById(R.id.button_fetch_data);
        buttonFetchData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDataSource.fetchData();
            }
        });

        Button buttonInitData = findViewById(R.id.button_init_data);
        buttonInitData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDataSource.initData();
            }
        });
    }
}

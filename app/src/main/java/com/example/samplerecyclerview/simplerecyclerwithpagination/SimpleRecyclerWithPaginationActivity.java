package com.example.samplerecyclerview.simplerecyclerwithpagination;

import android.os.Bundle;
import android.os.Handler;
import android.widget.AbsListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.samplerecyclerview.R;

public class SimpleRecyclerWithPaginationActivity extends AppCompatActivity {

    LinearLayoutManager layoutManager;
    DataSource mDataSource;
    MyRecyclerViewAdapter myRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_recycler);

        //initialisation
        mDataSource = new DataSource();
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        myRecyclerViewAdapter = new MyRecyclerViewAdapter();
        layoutManager = new LinearLayoutManager(this);

        //fetching data
        myRecyclerViewAdapter.addData(mDataSource.getData());

        //setting recycler-view
        mRecyclerView.setAdapter(myRecyclerViewAdapter);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.addOnScrollListener(mOnScrollListener);
    }

    private boolean isScrolling = false;

    private RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL)
                isScrolling = true;

        }

        @Override
        public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            int totalItems = layoutManager.getItemCount();
            int visibleItems = layoutManager.getChildCount();
            int scrolledOutItems = layoutManager.findFirstVisibleItemPosition();

            if (isScrolling && visibleItems + scrolledOutItems == totalItems) {
                Toast.makeText(SimpleRecyclerWithPaginationActivity.this, "Loading more data...", Toast.LENGTH_SHORT).show();
                isScrolling = false;
                fetchAndAddMoreData();
            }
        }
    };

    private void fetchAndAddMoreData() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                myRecyclerViewAdapter.addPaginatedData(mDataSource.getData());
            }
        }, 1500);
    }
}
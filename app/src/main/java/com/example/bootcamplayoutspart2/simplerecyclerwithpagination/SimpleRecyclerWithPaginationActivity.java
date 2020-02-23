package com.example.bootcamplayoutspart2.simplerecyclerwithpagination;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcamplayoutspart2.R;

public class SimpleRecyclerWithPaginationActivity extends AppCompatActivity {

    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_recycler);

        //initialisation
        DataSource mDataSource = new DataSource();
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter();
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
            }

        }
    };
}

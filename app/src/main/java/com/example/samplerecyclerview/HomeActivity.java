package com.example.samplerecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.samplerecyclerview.simplerecycler.SimpleRecyclerActivity;
import com.example.samplerecyclerview.simplerecyclerwithmultitype.SimpleRecyclerWithMultiTypeActivity;
import com.example.samplerecyclerview.simplerecyclerwithpagination.SimpleRecyclerWithPaginationActivity;
import com.example.samplerecyclerview.staggeredrecycler.StaggeredRecyclerActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewType1, textViewType2, textViewType3, textViewType4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textViewType1 = findViewById(R.id.text_simple_recycler);
        textViewType2 = findViewById(R.id.text_simple_recycler_with_pagination);
        textViewType3 = findViewById(R.id.text_simple_recycler_with_multi_type);
        textViewType4 = findViewById(R.id.text_staggered_recycler);

        textViewType1.setOnClickListener(this);
        textViewType2.setOnClickListener(this);
        textViewType3.setOnClickListener(this);
        textViewType4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_simple_recycler: {
                startActivity(new Intent(this, SimpleRecyclerActivity.class));
                break;
            }
            case R.id.text_simple_recycler_with_pagination: {
                startActivity(new Intent(this, SimpleRecyclerWithPaginationActivity.class));
                break;
            }
            case R.id.text_simple_recycler_with_multi_type: {
                startActivity(new Intent(this, SimpleRecyclerWithMultiTypeActivity.class));
                break;
            }
            case R.id.text_staggered_recycler: {
                startActivity(new Intent(this, StaggeredRecyclerActivity.class));
                break;
            }
        }
    }
}

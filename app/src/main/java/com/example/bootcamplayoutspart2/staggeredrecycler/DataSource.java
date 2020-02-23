package com.example.bootcamplayoutspart2.staggeredrecycler;

import com.example.bootcamplayoutspart2.R;

import java.util.ArrayList;

class DataSource {

    private ArrayList<Integer> arrayList;

    DataSource() {
        this.arrayList = new ArrayList<>();
    }

    ArrayList<Integer> getData() {
        for (int i = 0; i < 10; i++) {
            arrayList.add(R.drawable.dumy1);
            arrayList.add(R.drawable.dumy2);
            arrayList.add(R.drawable.landscape1);
            arrayList.add(R.drawable.dumy3);
            arrayList.add(R.drawable.dumy4);
            arrayList.add(R.drawable.landscape2);
            arrayList.add(R.drawable.dumy5);
            arrayList.add(R.drawable.dumy6);
            arrayList.add(R.drawable.landscape3);
            arrayList.add(R.drawable.dumy7);
            arrayList.add(R.drawable.landscape4);
        }
        return arrayList;
    }
}

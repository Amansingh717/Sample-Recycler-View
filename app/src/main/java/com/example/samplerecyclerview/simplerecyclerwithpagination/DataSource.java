package com.example.samplerecyclerview.simplerecyclerwithpagination;

import java.util.ArrayList;

class DataSource {

    private ArrayList<Double> arrayList;

    DataSource() {
        this.arrayList = new ArrayList<>();
    }

    ArrayList<Double> getData() {
        arrayList.clear();
        for (int i = 0; i < 20; i++) {
            arrayList.add(Math.random());
        }
        return arrayList;
    }
}

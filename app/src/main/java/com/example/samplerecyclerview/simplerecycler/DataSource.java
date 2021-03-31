package com.example.samplerecyclerview.simplerecycler;

import java.util.ArrayList;

/**
 * Data source is used to get a list of 20 items with random double type values
 */
class DataSource {

    private ArrayList<Double> arrayList;

    DataSource() {
        this.arrayList = new ArrayList<>();
    }

    ArrayList<Double> getData() {
        for (int i = 0; i < 20; i++) {
            arrayList.add(Math.random());
        }
        return arrayList;
    }
}

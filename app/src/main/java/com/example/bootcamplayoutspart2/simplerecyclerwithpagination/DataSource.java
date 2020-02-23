package com.example.bootcamplayoutspart2.simplerecyclerwithpagination;

import java.util.ArrayList;

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

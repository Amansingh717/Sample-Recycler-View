package com.example.bootcamplayoutspart2;

import java.util.ArrayList;

public class DataSource {

    private ArrayList<Double> arrayList;

    DataSource() {
        this.arrayList = new ArrayList<>();
    }

    public ArrayList<Double> getData() {
        for (int i = 0; i < 20; i++) {
            arrayList.add(Math.random());
        }
        return arrayList;
    }
}

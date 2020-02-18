package com.example.bootcamplayoutspart2.simplerecyclerwithmultitype;

import java.util.ArrayList;

public class DataSource {

    private ArrayList<DataItem> arrayList;

    DataSource() {
        this.arrayList = new ArrayList<>();
    }

    public ArrayList<DataItem> getData() {
        for (int i = 0; i < 30; i++) {

        }
        return arrayList;
    }
}

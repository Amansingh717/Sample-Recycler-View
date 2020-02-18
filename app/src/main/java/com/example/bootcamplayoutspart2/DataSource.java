package com.example.bootcamplayoutspart2;

import androidx.annotation.Nullable;
import androidx.lifecycle.MediatorLiveData;

import java.util.ArrayList;

class DataSource {

    MediatorLiveData<ArrayList<Data>> arrayListLiveData;

    void initData() {
        ArrayList<Data> arrayListData = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Data data = new Data(i, Math.random());
            arrayListData.add(data);
        }
        arrayListLiveData.setValue(arrayListData);
    }

    void fetchData() {
        ArrayList<Data> arrayListData = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                Data data = new Data(i, Math.random());
                arrayListData.add(data);
            }
        }
        arrayListLiveData.setValue(arrayListData);
    }

    DataSource() {
        this.arrayListLiveData = new MediatorLiveData<>();
    }

    class Data {
        private int id;
        private double value;

        public Data(int id, double value) {
            this.id = id;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(@Nullable Object obj) {
            return this == obj;
        }
    }
}

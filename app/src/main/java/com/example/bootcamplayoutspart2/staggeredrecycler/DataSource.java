package com.example.bootcamplayoutspart2.staggeredrecycler;

import java.util.ArrayList;
import java.util.Random;

class DataSource {

    private ArrayList<String> arrayList;
    private int[] size = {150, 300, 450};

    DataSource() {
        this.arrayList = new ArrayList<>();
    }

    ArrayList<String> getData() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            String w = String.valueOf(size[random.nextInt(2)]);
            String h = String.valueOf(size[random.nextInt(2)]);
            String url = "http://placekitten.com/" + w + "/" + h;
            arrayList.add(url);
        }
        return arrayList;
    }
}

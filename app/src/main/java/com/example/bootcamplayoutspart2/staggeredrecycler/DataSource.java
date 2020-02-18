package com.example.bootcamplayoutspart2.staggeredrecycler;

import java.util.ArrayList;
import java.util.Random;

public class DataSource {

    private ArrayList<String> arrayList;
    private int[] size = {150, 250};

    DataSource() {
        this.arrayList = new ArrayList<>();
    }

    public ArrayList<String> getData() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            String w = String.valueOf(size[random.nextInt(1)]);
            String h = String.valueOf(size[random.nextInt(1)]);
            String url = "http://placekitten.com/" + w + "/" + h;
            arrayList.add(url);
        }
        return arrayList;
    }
}

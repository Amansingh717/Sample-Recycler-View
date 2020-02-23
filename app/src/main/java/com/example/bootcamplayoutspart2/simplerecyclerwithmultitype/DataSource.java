package com.example.bootcamplayoutspart2.simplerecyclerwithmultitype;

import com.example.bootcamplayoutspart2.R;

import java.util.ArrayList;

class DataSource {

    private ArrayList<DataItem> arrayList;

    private String[] quotesArray;
    private int[] imagesArray;
    private String[] titlesArray;


    DataSource() {
        this.arrayList = new ArrayList<>();

        quotesArray = new String[5];
        quotesArray[0] = "“Write it on your heart that every day is the best day in the year.”";
        quotesArray[1] = "“I get up every morning and it’s going to be a great day. You never know when it’s going to be over, so I refuse to have a bad day.”";
        quotesArray[2] = "“Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.”";
        quotesArray[3] = "“An early-morning walk is a blessing for the whole day.”";
        quotesArray[4] = " “I wake up every morning at nine and grab for the morning paper. Then I look at the obituary page. If my name is not on it, I get up.”";

        imagesArray = new int[]{
                R.drawable.landscape1,
                R.drawable.landscape2,
                R.drawable.landscape3,
                R.drawable.landscape4,
                R.drawable.landscape5
        };

        titlesArray = new String[5];
        titlesArray[0] = "Quote by Ralph Waldo Emerson";
        titlesArray[1] = "Quote by Paul Henderson";
        titlesArray[2] = "Quote by Nanea Hoffman";
        titlesArray[3] = "Quote by Henry David Thoreau";
        titlesArray[4] = "Quote by Benjamin Franklin";
    }

    ArrayList<DataItem> getData() {
        for (int i = 0; i < 5; i++) {
            DataItem dataItem;

            dataItem = new DataItem(0, imagesArray[i], null);
            arrayList.add(dataItem);

            dataItem = new DataItem(1, imagesArray[i], titlesArray[i]);
            arrayList.add(dataItem);

            dataItem = new DataItem(2, -1, quotesArray[i]);
            arrayList.add(dataItem);
        }

        return arrayList;
    }

}

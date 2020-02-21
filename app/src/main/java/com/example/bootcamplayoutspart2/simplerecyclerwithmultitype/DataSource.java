package com.example.bootcamplayoutspart2.simplerecyclerwithmultitype;

import java.util.ArrayList;

class DataSource {

    private ArrayList<DataItem> arrayList;
    private String dummyTitleText = "Lorem ipsum";
    private String dummyDescriptionText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    private String dummyImageUrl = "https://source.unsplash.com/160x90/?animal";

    DataSource() {
        this.arrayList = new ArrayList<>();
    }

    ArrayList<DataItem> getData() {
        for (int i = 0; i < 30; i++) {
            int itemType = i % 3;
            DataItem dataItem;

            if (itemType == DataItem.ITEM_TYPE_IMAGE_WITH_DESCRIPTION) {
                dataItem = new DataItem(itemType, dummyImageUrl, dummyDescriptionText);
            } else if (itemType == DataItem.ITEM_TYPE_IMAGE) {
                dataItem = new DataItem(itemType, dummyImageUrl, null);
            } else {
                dataItem = new DataItem(itemType, null, dummyTitleText);
            }

            arrayList.add(dataItem);
        }
        return arrayList;
    }

}

package com.example.samplerecyclerview.simplerecyclerwithmultitype;

/**
 * Represents one item in a multi-view type recycler-view
 */
public class DataItem {
    public static final int ITEM_TYPE_0 = 0;
    public static final int ITEM_TYPE_1 = 1;
    public static final int ITEM_TYPE_2 = 2;

    private int itemType;
    private int itemImage;
    private String itemText;

    DataItem(int itemType, int itemImage, String itemText) {
        this.itemType = itemType;
        this.itemImage = itemImage;
        this.itemText = itemText;
    }

    int getItemType() {
        return itemType;
    }

    int getItemImage() {
        return itemImage;
    }

    String getItemText() {
        return itemText;
    }
}

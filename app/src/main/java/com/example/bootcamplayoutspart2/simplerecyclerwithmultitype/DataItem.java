package com.example.bootcamplayoutspart2.simplerecyclerwithmultitype;

/**
 * Represents one item in a multi-view type recycler-view
 */
public class DataItem {
    public static final int ITEM_TYPE_IMAGE_WITH_DESCRIPTION = 0;
    public static final int ITEM_TYPE_IMAGE = 1;
    public static final int ITEM_TYPE_DESCRIPTION = 2;

    private int itemType;
    private String textImageUrl;
    private String textDescription;

    public DataItem(int itemType, String textImageUrl, String textDescription) {
        this.itemType = itemType;
        this.textImageUrl = textImageUrl;
        this.textDescription = textDescription;
    }

    public int getItemType() {
        return itemType;
    }

    public String getTextImageUrl() {
        return textImageUrl;
    }

    public String getTextDescription() {
        return textDescription;
    }
}

package com.example.bootcamplayoutspart2.simplerecyclerwithmultitype;

public class DataItem {
    public static final int ITEM_TYPE_IMAGE_WITH_DESCRIPTION = 0;
    public static final int ITEM_TYPE_BANNER = 1;
    public static final int ITEM_TYPE_DESCRIPTION = 2;

    int itemType;
    String textBannerUrl;
    String textDescription;

    public DataItem(int itemType, String textBannerUrl, String textDescription) {
        this.itemType = itemType;
        this.textBannerUrl = textBannerUrl;
        this.textDescription = textDescription;
    }
}

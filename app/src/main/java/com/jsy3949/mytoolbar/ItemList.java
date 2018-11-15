package com.jsy3949.mytoolbar;

public class ItemList {
    public int item_image;
    public String item_title;
    public String item_subtitle;

    public ItemList(int item_image, String item_title, String item_subtitle) {
        this.item_image = item_image;
        this.item_title = item_title;
        this.item_subtitle = item_subtitle;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public String getItem_subtitle() {
        return item_subtitle;
    }

    public void setItem_subtitle(String item_subtitle) {
        this.item_subtitle = item_subtitle;
    }
}

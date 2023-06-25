package com.aman.furniture;

import android.graphics.drawable.Drawable;

public class Arrival {
    String name;
    String price;
    Drawable image;
    boolean isFav;

    public Arrival(String name, String price, Drawable image, boolean isFav) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.isFav = isFav;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }
}

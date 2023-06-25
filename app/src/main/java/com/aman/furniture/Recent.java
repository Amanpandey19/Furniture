package com.aman.furniture;

import android.graphics.drawable.Drawable;

public class Recent {
    String name;
    String price;
    Drawable image;

    public Recent(String name, String price, Drawable image) {
        this.name = name;
        this.price = price;
        this.image = image;
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
}

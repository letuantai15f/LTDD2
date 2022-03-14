package com.example.myapplication;

public class items {
        private int img;
        private String name;
        private String nameshop;

    public items(int img, String name, String nameshop) {
        this.img = img;
        this.name = name;
        this.nameshop = nameshop;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameshop() {
        return nameshop;
    }

    public void setNameshop(String nameshop) {
        this.nameshop = nameshop;
    }
}

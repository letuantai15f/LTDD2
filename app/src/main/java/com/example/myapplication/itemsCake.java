package com.example.myapplication;

import java.io.Serializable;

public class itemsCake implements Serializable {
    private int id;
    private int img;
    private String ten;
    private  String mota;
    private String giatien;

    public itemsCake(int id,int img, String ten, String mota, String giatien) {
        this.id= id;
        this.img = img;
        this.ten = ten;
        this.mota = mota;
        this.giatien = giatien;
    }

    public itemsCake(int id, String ten, String mota, String giatien) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.giatien = giatien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public  String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public   String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public   String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

}

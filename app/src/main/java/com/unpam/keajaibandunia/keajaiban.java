package com.unpam.keajaibandunia;
import java.io.Serializable;

public class keajaiban implements Serializable {
    private String judul, ibukota, desc;
    private int img;

    public keajaiban(){

    }

    public keajaiban(String judul, String ibukota, int img) {
        this.judul = judul;
        this.ibukota = ibukota;
        this.desc = desc;
        this.img = img;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIbukota() {
        return ibukota;
    }

    public void setIbukota(String ibukota) {
        this.ibukota = ibukota;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDesc() { return  desc; }

    public void setDesc(String desc) { this.desc = desc;}
}

package com.ug5c.soal1;

public class Keyboard {
    private String merkModel;
    private long harga;

    public void setMerkModel(String merkModel) {
        this.merkModel = merkModel;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public String getMerkModel() {
        return merkModel;
    }

    public long getHarga() {
        return harga;
    }

    public void Keyboard(String merkModel, long harga) {
        this.merkModel = merkModel;
        this.harga = harga;
    }

}

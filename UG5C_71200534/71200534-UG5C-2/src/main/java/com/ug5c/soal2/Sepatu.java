package com.ug5c.soal2;

public class Sepatu {
    private static int counter = 0;
    private String kode;
    private int nextNUm;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;

    public String getKode() {
        return kode;
    }

    public String getMerkModel() {
        return merkModel;
    }

    public int getUkuran() {
        return ukuran;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public Sepatu(String merkModel, int ukuran, long harga, int stok) {
        this.merkModel = merkModel;
        this.ukuran = ukuran;
        this.harga = harga;
        this.stok = stok;
        this.kode = "NK0024510" + ++this.counter;
    }




}

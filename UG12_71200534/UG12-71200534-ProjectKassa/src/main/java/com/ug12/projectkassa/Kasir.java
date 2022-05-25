package com.ug12.projectkassa;

public class Kasir {
    private String password;
    private long totalPenjualan;
    private String username;
    private String nama;

    public Kasir(String nama, String username, String password) {
        this.password = password;
        this.username = username;
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public long getTotalPenjualan() {
        return totalPenjualan;
    }

    public String getUsername() {
        return username;
    }

    public String getNama() {
        return nama;
    }

    public void setTotalPenjualan(long totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }
}

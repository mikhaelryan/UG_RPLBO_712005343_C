package com.ug14.rumahsakit;

public class Jadwal {
    private int idPemeriksaan;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private Boolean statusDaftar=false;
    private Boolean statusScreening=false;

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public int getIdPemeriksaan() {
        return idPemeriksaan;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public Suster getSuster() {
        return suster;
    }

    public Pelayanan getPelayanan() {
        return pelayanan;
    }

    public void setSuster(Suster suster) {
        this.suster = suster;
    }

    public void setPelayanan(Pelayanan pelayanan) {
        this.pelayanan = pelayanan;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public Boolean getStatusDaftar() {
        return statusDaftar;
    }

    public Boolean getStatusScreening() {
        return statusScreening;
    }

    public void setStatusDaftar(Boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public void setStatusScreening(Boolean statusScreening) {
        this.statusScreening = statusScreening;
    }
}

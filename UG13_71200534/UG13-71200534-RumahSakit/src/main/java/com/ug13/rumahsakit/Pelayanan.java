package com.ug13.rumahsakit;

import java.util.Scanner;

public class Pelayanan{
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien p, Dokter d, Jadwal j){
        if(p.getStatus()=="sakit"){
            j.setStatusDaftar(true);
            j.setPasien(p);
            j.setDokter(d);
            System.out.println("proses penjadwalan berhasil");
        };
    }

    public Pasien registrasi(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Masukan Nama anda: ");
        String nama=inp.nextLine();
        Scanner inp2=new Scanner(System.in);
        System.out.println("Masukan Usia anda: ");
        int usia=inp2.nextInt();
        Scanner inp3=new Scanner(System.in);
        System.out.println("Masukan alamat anda: ");
        String alamat=inp3.nextLine();
        Scanner inp4=new Scanner(System.in);
        System.out.println("Masukan penyakit anda: ");
        String penyakit=inp4.nextLine();
        System.out.println("Proses registrasi berhasil");
        return new Pasien(nama,usia,alamat,penyakit);
    }

}

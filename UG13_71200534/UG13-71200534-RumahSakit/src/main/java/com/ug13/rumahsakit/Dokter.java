package com.ug13.rumahsakit;


import java.io.*;

public class Dokter {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien p, Jadwal j){

        if(j.getStatusScreening()==true) {
            if (p.getLevelPenyakit() > 0) {
                p.setLevelPenyakit(p.getLevelPenyakit() - 1);
                if(p.getLevelPenyakit()>0){
                    System.out.println("pasien anda masih sakit");
                }else{
                    System.out.println("selamat pasien anda telah sembuh");
                }
            } else {
                p.setStatus("sembuh");
            }
        }else{
            System.out.println("anda harus melakukan pendaftaraan terlebih dahulu di bagian pelayanan!");
        }

        try{
            Dokter obj=new Dokter(this.nama,this.spesialis,this.ruangan);
            FileOutputStream fileOutput=new FileOutputStream("memeriksa.txt");
            ObjectOutputStream Output = new ObjectOutputStream(fileOutput);

            Output.writeObject(obj);
            Output.close();
        }catch(IOException e) {

        }

    }

    public void cekStatus(Pasien p){
        p.getStatus();
    }
}

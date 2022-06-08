package com.ug14.rumahsakit;

import java.io.*;

public class Dokter {
    private int idDokter;
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
        Dokter obj=new Dokter(this.nama,this.spesialis,this.ruangan);
        try{

            FileOutputStream fileOutput=new FileOutputStream("memeriksa.txt");
            ObjectOutputStream Output = new ObjectOutputStream(fileOutput);

            Output.writeObject(obj);
            Output.close();
        }catch(IOException e) {

        }
        try{
            FileInputStream fileIn = new FileInputStream("memeriksa.txt");
            ObjectInputStream input = new ObjectInputStream(fileIn);

            obj=(Dokter)input.readObject();
        }catch(Exception e) {

        }

    }

    public void cekStatus(Pasien p, Jadwal j){
        p.getStatus();
    }

    public int getIdDokter() {
        return idDokter;
    }
}

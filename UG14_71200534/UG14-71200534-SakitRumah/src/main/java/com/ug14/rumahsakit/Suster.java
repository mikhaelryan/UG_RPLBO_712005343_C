package com.ug14.rumahsakit;

import java.io.*;

public class Suster {
    private int idSuster;
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
    }

    public void screening(Pasien p, Jadwal j){
        if(j.getStatusDaftar()==true){
            j.setStatusScreening(true);
            j.setPasien(p);
            System.out.println("Proses screening suster berhasil");
        }else{
            System.out.println("anda harus melakukan pendaftaraan terlebih dahulu di bagian pelayanan!");
        }

        Suster suster=new Suster(this.nama);

        try{

            FileOutputStream fileOutput=new FileOutputStream("screening.txt");
            ObjectOutputStream Output = new ObjectOutputStream(fileOutput);

            Output.writeObject(suster);
            Output.close();
        }catch(IOException e) {

        }

        try{
            FileInputStream fileIn = new FileInputStream("screening.txt");
            ObjectInputStream input = new ObjectInputStream(fileIn);

            suster=(Suster)input.readObject();
        }catch(Exception e) {

        }
    }

    public int getIdSuster() {
        return idSuster;
    }
}

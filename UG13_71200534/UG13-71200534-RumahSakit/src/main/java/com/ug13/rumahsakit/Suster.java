package com.ug13.rumahsakit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Suster {
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
    }

    public void screening(Pasien p, Jadwal j){
        if(j.getStatusDaftar()==true){
            j.setStatusScreening(true);
            System.out.println("Proses screening suster berhasil");
        }else{
            System.out.println("anda harus melakukan pendaftaraan terlebih dahulu di bagian pelayanan!");
        }

        try{
            Suster suster=new Suster(this.nama);
            FileOutputStream fileOutput=new FileOutputStream("memeriksa.txt");
            ObjectOutputStream Output = new ObjectOutputStream(fileOutput);

            Output.writeObject(suster);
            Output.close();
        }catch(IOException e) {

        }
    }
}

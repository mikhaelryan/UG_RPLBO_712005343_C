package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kassa {
    private HashMap<Produk, Integer> pesanan = new HashMap<>();
    private ArrayList<Kasir> arrKasir = new ArrayList<>();
    private Kasir kasir;

    public Kassa(){}

    public void login(String username, String password){
            for (int i = 0; i < arrKasir.size(); i++){
                if(arrKasir.get(i).getUsername()==username && arrKasir.get(i).getPassword()==password) {
                    this.kasir = arrKasir.get(i);
                    System.out.println("berhasil login!");
                    break;
                }else if (i==arrKasir.size()-1){
                    System.out.println("username/password anda salah!");
                }
            }

    }

    public void register(Kasir k){
        arrKasir.add(k);
        System.out.println("Kasir "+k.getNama()+" berhasil ditambahkan ke dalam sistem");
    }

    public void tambahPesanan(Produk p, int x){
        pesanan.put(p, x);
    }

    public void printNota(){
        System.out.println("==================NOta==================");
        System.out.println("Kasir: "+this.kasir.getNama());
        System.out.println("No.\tNama barang\tJumlah\tHarga\tSub Total");
        int i=0;
        for(HashMap.Entry<Produk, Integer> ind:pesanan.entrySet()){
            i++;
            System.out.println(i+"\t"+ind.getKey().getNama()+"\t"+ind.getValue()+"\t"+ind.getKey().getHarga()+"\t"+ind.getKey().getHarga()*ind.getValue());
            this.kasir.setTotalPenjualan(this.kasir.getTotalPenjualan()+ind.getKey().getHarga()*ind.getValue());
        }
        pesanan.clear();
    }

    public void printPenjualanKasir(){
        System.out.println("Daftar Kasir:");
        System.out.println("No. \t Nama \t Total Penjualan");
        for (int i = 0; i < arrKasir.size(); i++) {
            System.out.println((i+1)+" \t "+arrKasir.get(i).getNama()+" \t "+arrKasir.get(i).getTotalPenjualan());
        }
    }
}

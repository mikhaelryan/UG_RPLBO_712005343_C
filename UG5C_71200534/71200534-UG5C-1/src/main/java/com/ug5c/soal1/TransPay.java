package com.ug5c.soal1;

public class TransPay {
    private String nama;
    private long saldo;

    public String getNama() {
        return nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void TransPay(String nama, long saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public void topUp(long jumlah){
        if (jumlah > 0){
            this.setSaldo(this.saldo+jumlah);
            System.out.println("Top up sebesar "+jumlah+" berhasil");
        } else {
            System.out.println("nominal anda tidak valid! nominal harus lebih dari 0");
        }
    }

    public void bayar(int jumlah, Keyboard k){
        if (jumlah > 0 && (jumlah*k.getHarga()) <= this.saldo){
            this.setSaldo(this.saldo-(jumlah*k.getHarga()));
            System.out.println("Pembayaran sukses silahkan mengambil"+k.getMerkModel()+" di counter");
        } else if (jumlah <= 0){
            System.out.println("input jumlah tidak valid");
        } else if (jumlah*k.getHarga() > this.saldo){
            System.out.println("Pembayaran gagal! saldo anda kurang, silahkan melakukan top up!");
        }

    }
}

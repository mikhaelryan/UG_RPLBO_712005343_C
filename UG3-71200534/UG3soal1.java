package com.ug3.soal1;
import java.util.Scanner;
public class UG3soal1 {

    public static void main(String args[]) {
        System.out.println("Masukan data product makanan anda ");
        Scanner inpMakanan = new Scanner(System.in);
        System.out.println("Nama makanan: ");
        String Makanan = inpMakanan.nextLine();
        Scanner inpKadaluarsa = new Scanner(System.in);
        System.out.println("Tanggal kadaluarsa: ");
        String Kadaluarsa = inpKadaluarsa.nextLine();
        Scanner inpJumlah = new Scanner(System.in);
        System.out.println("Jumlah(Quantity):  ");
        String Jumlah = inpJumlah.nextLine();
        Scanner inpBerat = new Scanner(System.in);
        System.out.println("Berat(gram): ");
        String Berat = inpBerat.nextLine();
        System.out.println("Nama makanan = "+Makanan);
        System.out.println("Tanggal kadaluarsa = "+Kadaluarsa);
        System.out.println("Jumlah(quantity) = "+Jumlah);
        System.out.println("Berat(gram) = "+Berat);
    }
}

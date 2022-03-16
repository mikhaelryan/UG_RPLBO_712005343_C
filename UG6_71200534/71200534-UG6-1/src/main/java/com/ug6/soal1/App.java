package com.ug6.soal1;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Buat Vending Machine terlebih dahulu");
        Scanner inp = new Scanner(System.in);
        System.out.println("Kapasitas max");
        String maks = inp.nextLine();
        System.out.println("Apakah anda akan menambahkan barang sekarang?");
        System.out.println("ya(y) atau tidak(t)");
        String menambah = inp.nextLine();
        System.out.println("Nama Barang:");
        String barang = inp.nextLine();
        System.out.println("type barang\n1. Minuman \n2. Makanan \n3. Produk Digital");
        String tipe = inp.nextLine();
    }
}

import java.util.Scanner;
public class bayar {

    Scanner inp = new Scanner(System.in);
    System.out.print("Banyak belanjaan: ");
    int jmlBarang = inp.nextInt();
    int urutan = 1;
    while (jmlBarang > 0){
        Scanner brng = new Scanner(System.in);
        System.out.print("Harga Barang ke-"+urutan);
        int hargaBarang = inp.nextInt();
        urutan = urutan + 1;
    }

}

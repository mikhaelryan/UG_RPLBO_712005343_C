import java.util.Scanner;
public class Main {
    private String M_71200534;
    private String P_71200534;

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini: ");
        int kodeLampu = inp.nextInt();
        Mobil mobil = new Mobil();
        PejalanKaki pejalankaki = new PejalanKaki();
        if (kodeLampu == 1) {
            System.out.println(mobil.jalan()+"\n"+pejalankaki.menunggu());
        } else if (kodeLampu == 2) {
            System.out.println(mobil.kurangiKecepatan()+"\n"+pejalankaki.bersiap());
        } else if (kodeLampu == 3) {
            System.out.println(mobil.berhenti()+"\n"+pejalankaki.menyebrang());
        } else {
            System.out.println("tidak valid");
        }
    }
}

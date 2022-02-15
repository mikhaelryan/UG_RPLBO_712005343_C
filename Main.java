public class Main {

    public static void main(String args[]){
        System.out.println("Hello world");
        Lampu lamp = new Lampu();
        System.out.println(lampu.warnaSekarang());
        lampu.gantiWarna("Merah");
        System.out.println(lampu.warnaSekarang());

    }
}

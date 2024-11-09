public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");

        // Membuat objek kucing
        Kucing kucing = new Kucing("Bubu", 3, "Anggora");
        kucing.infoHewan();
        System.out.println();
        System.out.println("ini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("wetfood");
        System.out.println();

        // Membuat objek burung
        Burung burung = new Burung("Gaga", 6, "Hitam");
        burung.infoHewan();
        System.out.println();
        System.out.println("ini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("kacang-kacangan");
    }
}
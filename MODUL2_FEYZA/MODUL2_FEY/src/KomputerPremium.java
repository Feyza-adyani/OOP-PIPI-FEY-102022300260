public class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;

    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerjam);
        this.ruangPrivat = ruangPrivat;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang
    // sesuai dengan ketentuan
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh
    // materi modul!)
    @Override
    public void Information() {
        System.out.println("Jumlah komputer: " + jumlahKomputer);
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("JUmlah komputer: " + jumlahKomputer);
        if (ruangPrivat) {
            System.out.println("Fasilitas ruang privat :");
            System.out.println("-Ruangan ber-AC pribadi:");
            System.out.println("-Sofa gaming ekslusif");
            System.out.println("-Komputer spesifikasi tinggi");
            System.out.println("-Koneksi internet dedicated 100Mbps");
        } else {
            System.out.println("Fasilitas ruang standar");
            System.out.println("-Ruang gerah :");
            System.out.println("-Sofa majapahit:");
            System.out.println("-Komputer spesifikasi rendah");
            System.out.println("-Koneksi internet dedicated 1Mbps");
        }
    }

    // To do: Buatlah method pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer) {
        System.out.println("Nomor komputer: " + nomorKomputer);
    }

    // To do: Buatlah method tambah layanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan) {
        System.out.println("Memesan makanan :" + makanan);
    }

    // To do: Buatlah method tambah layanan memakai Polymorphism Overloading sesuai
    // dengan ketentuan
    public void TambahLayanan(String makanan, String minuman) {
        System.out.println("Memesan makanan dan minuman: " + makanan + minuman);
    }
}
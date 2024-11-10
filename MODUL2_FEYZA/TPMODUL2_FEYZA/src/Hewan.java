class Hewan {
    protected String nama;
    protected int umur;

    // Constructor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method suara
    public void suara() {
        System.out.println(nama + " bersuara.");
    }

    // Method makan
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    // Overloaded method makan
    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan + ".");
    }

    // Method infoHewan
    public void infoHewan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}
class Kucing extends Hewan {
    private String ras;

    // Constructor
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    // Overridden method suara
    @Override
    public void suara() {
        System.out.println(nama + " mengeong.");
    }

    // Overridden method infoHewan
    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Ras: " + ras);
    }
}
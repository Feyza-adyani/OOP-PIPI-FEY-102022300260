class Burung extends Hewan {
    private String warnaBulu;

    // Constructor
    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    // Overridden method suara
    @Override
    public void suara() {
        System.out.println(nama + " berkicau.");
    }

    // Overridden method infoHewan
    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Warna bulu: " + warnaBulu);
    }
}

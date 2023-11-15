class Resepsionis extends Pasien {
    private String nomorResepsionis;

    public Resepsionis(String nama, int usia, String nomorResepsionis) {
        super(nama, usia);
        this.nomorResepsionis = nomorResepsionis;
    }

    public String getNomorResepsionis() {
        return nomorResepsionis;
    }
}

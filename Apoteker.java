class Apoteker extends Pasien {
    private String nomorApoteker;

    public Apoteker(String nama, int usia, String nomorApoteker) {
        super(nama, usia);
        this.nomorApoteker = nomorApoteker;
    }

    public String getNomorApoteker() {
        return nomorApoteker;
    }
}
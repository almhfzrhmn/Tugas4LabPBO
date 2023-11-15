class Dokter extends Pasien {
    private String nomorDokter;

    public Dokter(String nama, int usia, String nomorDokter) {
        super(nama, usia);
        this.nomorDokter = nomorDokter;
    }

    public String getNomorDokter() {
        return nomorDokter;
    }
}


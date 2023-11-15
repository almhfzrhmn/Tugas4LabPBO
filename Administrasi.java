class Administrasi extends Pasien {
    private String nomorAdministrasi;

    public Administrasi(String nama, int usia, String nomorAdministrasi) {
        super(nama, usia);
        this.nomorAdministrasi = nomorAdministrasi;
    }

    public String getNomorAdministrasi() {
        return nomorAdministrasi;
    }
}

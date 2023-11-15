public class perawat {
    
}
class Perawat extends Pasien {
    private String nomorPerawat;

    public Perawat(String nama, int usia, String nomorPerawat) {
        super(nama, usia);
        this.nomorPerawat = nomorPerawat;
    }

    public String getNomorPerawat() {
        return nomorPerawat;
    }
}

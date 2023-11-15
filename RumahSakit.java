public class RumahSakit {
    public static void main(String[] args) {
        Dokter dokter = new Dokter("Dr. Siti", 40, "D12345");
        Perawat perawat = new Perawat("Rini", 28, "P98765");
        Administrasi administrasi = new Administrasi("Budi", 25, "A24680");

        Pendaftaran pendaftaran = new Pendaftaran();

        pendaftaran.cetakInfo(dokter);
        System.out.println("--------------------------");

        pendaftaran.cetakInfo(perawat);
        System.out.println("--------------------------");

        pendaftaran.cetakInfo(administrasi);
    }
}
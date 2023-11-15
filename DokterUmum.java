class DokterUmum extends Pasien implements Obatable, TindakanMedis, CatatanMedis {
    public DokterUmum(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void beriObat() {
        System.out.println("Memberikan resep obat.");
    }

    @Override
    public void lakukanTindakan() {
        System.out.println("Melakukan pemeriksaan fisik dan memberikan tindakan medis umum.");
    }

    @Override
    public void tambahCatatan() {
        System.out.println("Menambahkan catatan medis pasien.");
    }
}
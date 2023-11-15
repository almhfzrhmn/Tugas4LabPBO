class Pendaftaran {
    public void cetakInfo(Pasien pasien) {
        System.out.println("Nama: " + pasien.getNama());
        System.out.println("Usia: " + pasien.getUsia());

        if (pasien instanceof Dokter) {
            System.out.println("Nomor Dokter: " + ((Dokter) pasien).getNomorDokter());
        } else if (pasien instanceof Perawat) {
            System.out.println("Nomor Perawat: " + ((Perawat) pasien).getNomorPerawat());
        } else if (pasien instanceof Administrasi) {
            System.out.println("Nomor Administrasi: " + ((Administrasi) pasien).getNomorAdministrasi());
        }
    }
}
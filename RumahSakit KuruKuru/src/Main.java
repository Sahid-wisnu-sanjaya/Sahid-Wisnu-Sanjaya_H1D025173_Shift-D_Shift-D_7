public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO SISTEM MANAJEMEN RS KURU KURU ===");

        Dokter drHatsune = new Dokter("DOC001", "dr. Hatsune Miku", 40, 75000.0, "Spesialis Anak", 8, 200000.0);
        drHatsune.tampilkanInformasi();
        drHatsune.prosesGaji();

        System.out.println();

        drHatsune.rawatPasien();
        drHatsune.rawatPasien();
        drHatsune.rawatPasien();
        drHatsune.prosesGaji();

        System.out.println();

        Perawat prwBudi = new Perawat("NRS001", "Budi, S.Kep", 36, 40000.0, "Mawar", true);
        prwBudi.tampilkanInformasi();
        prwBudi.prosesGaji();

        System.out.println();

        System.out.println("--- DEMO POLIMORFISME INTERFACE ---");
        LayananKesehatan layanan1 = drHatsune;
        LayananKesehatan layanan2 = prwBudi;

        layanan1.rawatPasien();
        layanan2.rawatPasien();

        SistemTagihan tagihan1 = drHatsune;
        System.out.println("Total Estimasi Tagihan Dokter: Rp " + tagihan1.hitungTotalBiaya());
    }
}
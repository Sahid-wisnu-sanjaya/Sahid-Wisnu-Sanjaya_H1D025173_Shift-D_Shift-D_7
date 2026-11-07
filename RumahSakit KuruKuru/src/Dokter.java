public class Dokter extends PegawaiRS implements LayananKesehatan, SistemTagihan {
    private String spesialisasi;
    private int jumlahPasien;
    private double biayaKonsultasi;

    public Dokter(String idPegawai, String nama, String spesialisasi) {
        super(idPegawai, nama);
        this.spesialisasi = spesialisasi;
        this.jumlahPasien = 0;
        this.biayaKonsultasi = 150000.0;
    }

    public Dokter(String idPegawai, String nama, int jamKerja, double tarifPerJam, String spesialisasi, int jumlahPasien, double biayaKonsultasi) {
        super(idPegawai, nama, jamKerja, tarifPerJam);
        this.spesialisasi = spesialisasi;
        this.jumlahPasien = jumlahPasien;
        this.biayaKonsultasi = biayaKonsultasi;
    }

    @Override
    public void prosesGaji() {
        double gajiPokok = getJamKerja() * getTarifPerJam();
        double bonusPasien = 0;

        if (this.jumlahPasien > 10) {
            bonusPasien = 500000.0;
            System.out.println("Bonus Kinerja Terlampaui: Rp " + bonusPasien);
        } else if (this.jumlahPasien > 5) {
            bonusPasien = 200000.0;
            System.out.println("Bonus Kinerja Standar: Rp " + bonusPasien);
        } else {
            System.out.println("Bonus Kinerja: Belum Mencapai Target");
        }

        double totalGaji = gajiPokok + bonusPasien;
        System.out.println("Total Gaji Dokter " + getNama() + ": Rp " + totalGaji);
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jabatan     : Dokter (" + this.spesialisasi + ")");
        System.out.println("Jml Pasien  : " + this.jumlahPasien);
    }

    @Override
    public void rawatPasien() {
        this.jumlahPasien++;
        System.out.println("Dokter " + getNama() + " sedang menangani pasien. Total pasien: " + this.jumlahPasien);
    }

    @Override
    public double hitungTotalBiaya() {
        return this.jumlahPasien * this.biayaKonsultasi;
    }

    public String getSpesialisasi() { return spesialisasi; }
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }
}
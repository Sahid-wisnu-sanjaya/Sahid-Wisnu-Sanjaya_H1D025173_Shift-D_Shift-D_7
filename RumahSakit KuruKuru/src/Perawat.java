public class Perawat extends PegawaiRS implements LayananKesehatan {
    private String ruangJaga;
    private boolean isShiftMalam;

    public Perawat(String idPegawai, String nama, String ruangJaga, boolean isShiftMalam) {
        super(idPegawai, nama);
        this.ruangJaga = ruangJaga;
        this.isShiftMalam = isShiftMalam;
    }

    public Perawat(String idPegawai, String nama, int jamKerja, double tarifPerJam, String ruangJaga, boolean isShiftMalam) {
        super(idPegawai, nama, jamKerja, tarifPerJam);
        this.ruangJaga = ruangJaga;
        this.isShiftMalam = isShiftMalam;
    }

    @Override
    public void prosesGaji() {
        double gaji = getJamKerja() * getTarifPerJam();
        if (isShiftMalam) {
            gaji += 150000.0;
        }
        System.out.println("Total Gaji Perawat " + getNama() + ": Rp " + gaji);
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jabatan     : Perawat Ruang " + this.ruangJaga);
        System.out.println("Shift Malam : " + (this.isShiftMalam ? "Ya" : "Tidak"));
    }

    @Override
    public void rawatPasien() {
        System.out.println("Perawat " + getNama() + " memberikan perawatan kepada pasien di ruang " + this.ruangJaga);
    }
}
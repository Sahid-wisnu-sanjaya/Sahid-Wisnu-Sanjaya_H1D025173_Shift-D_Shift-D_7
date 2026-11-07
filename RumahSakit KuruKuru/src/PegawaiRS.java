public abstract class PegawaiRS {
    // 1. Konstanta (public static final)
    public static final String NAMA_RUMAH_SAKIT = "RS Kuru Kuru";

    // 2. Atribut Instans Kekal (private final) - Immutability
    private final String idPegawai;

    // 3. Enkapsulasi Atribut Private
    private String nama;
    private int jamKerja;
    private double tarifPerJam;

    // Overloaded Constructor 1
    public PegawaiRS(String idPegawai, String nama) {
        this(idPegawai, nama, 0, 50000.0);
    }

    // Overloaded Constructor 2
    public PegawaiRS(String idPegawai, String nama, int jamKerja, double tarifPerJam) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }

    // Abstract Method
    public abstract void prosesGaji();

    // Method Prosedur & Fungsi
    public void tampilkanInformasi() {
        System.out.println("==========================================");
        System.out.println("Rumah Sakit : " + NAMA_RUMAH_SAKIT);
        System.out.println("ID Pegawai  : " + this.idPegawai);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Jam Kerja   : " + this.jamKerja + " jam");
    }

    // Getter dan Setter
    public String getIdPegawai() { return idPegawai; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getJamKerja() { return jamKerja; }
    public void setJamKerja(int jamKerja) { this.jamKerja = jamKerja; }
    public double getTarifPerJam() { return tarifPerJam; }
    public void setTarifPerJam(double tarifPerJam) { this.tarifPerJam = tarifPerJam; }
}
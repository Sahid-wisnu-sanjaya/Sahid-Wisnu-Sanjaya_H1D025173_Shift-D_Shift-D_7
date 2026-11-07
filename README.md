# Responsi Pemrograman Berbasis Objek

Nama : Sahid Wisnu Sanjaya  
NIM : H1D025173  
SHIFT AWAL : D  
SHIFT AKHIR : D

# Tema Sistem Rumah Sakit (RS Kuru Kuru)
## Alur Program

1. Program dijalankan melalui class `Main.java`. Class ini menginstansiasi objek `Dokter` (`drHatsune`) dan `Perawat` (`prwBudi`) di **RS Kuru Kuru** yang merupakan subclass dari abstract class `PegawaiRS`.
2. Program menampilkan informasi lengkap masing-masing pegawai menggunakan method `tampilkanInformasi()`, di mana `Dokter` dan `Perawat` memanggil method superclass menggunakan `super.tampilkanInformasi()`.
3. Menguji *Logika State Percabangan* dan *Immutability*:
   * Objek `Dokter` memiliki atribut kekal `idPegawai` (`private final`) dan batas target pasien.
   * Method `rawatPasien()` dipanggil beberapa kali untuk mengubah state `jumlahPasien`.
   * Method `prosesGaji()` dieksekusi untuk menghitung total gaji dan bonus kinerja berdasarkan jumlah pasien menggunakan percabangan `if-else`.
4. Menguji *Method Overriding* dan *Super Chaining*:
   * Subclass `Perawat` meng-override method `prosesGaji()` untuk memperhitungkan tunjangan shift malam.
5. Menguji *Polimorfisme Interface* & *Multiple Interface*:
   * Dipanggil melalui variabel referensi bertipe interface: `LayananRumahSakit` dan `SistemTagihan`.
   * Class `Dokter` mengimplementasikan dua interface sekaligus (`implements LayananRumahSakit, SistemTagihan`).
   * Interface `SistemTagihan` memproses kalkulasi biaya konsultasi total berdasarkan jumlah pasien yang dirawat.

## Fitur Program

1. Menampilkan informasi pegawai, dokter (dr. Hatsune Miku), dan perawat RS Kuru Kuru
2. Membedakan peran serta skema perhitungan gaji Dokter dan Perawat melalui inheritance
3. Melakukan simulasi penanganan dan perawatan pasien
4. Mengubah state internal objek berdasarkan jumlah pasien yang dirawat
5. Menghitung total biaya tagihan layanan kesehatan (Dokter)
6. Memproses kalkulasi gaji dan bonus kinerja pegawai secara otomatis
7. Mengimplementasikan polimorfisme interface, abstract class, dan multiple interface

# Cara Menjalankan Program
## 1. Compile Program
```bash
javac *.java


Bash
java Main

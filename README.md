# Responsi Pemrograman Berbasis Objek

Nama : Sahid Wisnu Sanjaya  
NIM : H1D025173  
SHIFT AWAL : D  
SHIFT AKHIR : D  

# Tema Sistem Rumah Sakit (RS Kuru Kuru)
## Alur Program

1. **Inisialisasi**
2. Program dijalankan melalui class `Main.java`. Class ini menginstansiasi objek `Dokter` (`drHatsune`) dan `Perawat` (`prwBudi`) di **RS Kuru Kuru** yang merupakan subclass dari abstract class `PegawaiRS`.
3. **Pembuatan Objek Pegawai & Dokter**
4. Di dalam class `Main`, program membuat dua objek pegawai rumah sakit:
   - Dokter bernama **dr. Hatsune Miku** (`Dokter`) spesialis anak dengan tarif awal dan jumlah pasien awal 8.
   - Perawat bernama **Budi, S.Kep** (`Perawat`) di Ruang Mawar yang bertugas pada shift malam.
5. **Informasi Awal Pegawai**
   - ID Pegawai.
   - Nama Pegawai/Dokter.
   - Jam Kerja & Tarif Per Jam.
   - Jabatan & Spesialisasi / Ruang Jaga.
   - Jumlah Pasien yang Ditangani / Status Shift Malam.
   - Total Gaji Awal & Bonus Kinerja.
   - Informasi ini ditampilkan memanfaatkan method `tampilkanInformasi()` yang di-*override* di masing-masing subclass dengan memanggil `super.tampilkanInformasi()`.
6. **Simulasi Pelayanan Pasien & Perubahan State**
7. Objek `drHatsune` menjalankan method `rawatPasien()` beberapa kali untuk mensimulasikan penanganan pasien baru:
   - Setiap panggilan `rawatPasien()` menambah nilai state `jumlahPasien`.
   - Perubahan state ini memicu perhitungan ulang gaji pada method `prosesGaji()`.
   - Logika percabangan `if-else` mengevaluasi batas pasien: jika `jumlahPasien > 10`, dokter mendapatkan Bonus Kinerja Terlampaui (Rp500.000).
8. **Proses Gaji & Tunjangan Shift**
9. Gaji diproses berdasarkan jam kerja, tarif per jam, serta kondisi khusus subclass:
   - Dokter mendapatkan bonus kinerja tambahan berdasarkan akumulasi jumlah pasien.
   - Perawat mendapatkan tunjangan tambahan shift malam (Rp150.000) jika `isShiftMalam` bernilai `true`.
10. **Polimorfisme & Multiple Interface**
11. Menguji eksekusi method melalui variabel referensi bertipe interface `LayananKesehatan` dan `SistemTagihan`:
    - Referensi `LayananKesehatan` memanggil `rawatPasien()` pada objek `Dokter` dan `Perawat`.
    - Class `Dokter` mengimplementasikan dua interface sekaligus (`implements LayananKesehatan, SistemTagihan`).
    - Referensi `SistemTagihan` memanggil `hitungTotalBiaya()` untuk menghitung total estimasi tagihan dokter berdasarkan jumlah pasien.
12. **Menampilkan Rekapitulasi Akhir**
13. Program mencetak status akhir total pasien dan kalkulasi estimasi tagihan secara rapi di konsol.

## Fitur Program

Penerapan 10 konsep teknis pada sistem:
1. **State & Behavior**: Menyimpan data pegawai/dokter/perawat dan menyediakan method aksi serta penghitungan gaji/tagihan.
2. **Immutability**: Menggunakan `public static final` (nama Rumah Sakit = "RS Kuru Kuru") dan `private final` (ID Pegawai).
3. **Enkapsulasi & Overloading**: Atribut `private`, getter/setter, keyword `this`, serta 2 variasi konstruktor pada class `PegawaiRS`, `Dokter`, dan `Perawat`.
4. **Inheritance**: Subclass `Dokter` dan `Perawat` mewarisi superclass `PegawaiRS`.
5. **Super Chaining**: Memanggil `super(...)` di konstruktor subclass dan `super.tampilkanInformasi()` pada method overriding.
6. **Method Overriding**: Menimpa method superclass dengan `@Override` pada subclass (`prosesGaji()` dan `tampilkanInformasi()`).
7. **Abstract Class**: Class `PegawaiRS` bersifat `abstract` dengan abstract method `prosesGaji()`.
8. **Logika State Percabangan**: Menggunakan `if-else` untuk update bonus kinerja berdasarkan `jumlahPasien` yang ditangani.
9. **Polimorfisme Interface**: Memanggil method via variabel referensi interface `LayananKesehatan` dan `SistemTagihan`.
10. **Multiple Interface**: Subclass `Dokter` mengimplementasikan dua interface sekaligus (`implements LayananKesehatan, SistemTagihan`).

# Cara Menjalankan Program

## 1. Clone Repository Github
```bash
git clone [https://github.com/Sahid-wisnu-sanjaya/RumahSakitKuruKuru](https://github.com/Sahid-wisnu-sanjaya/RumahSakitKuruKuru)

## 2. Masuk ke Folder Repository
'''Bash
cd RumahSakitKuruKuru

3. Compile Program
Bash
javac *.java

4. Jalankan Program
Bash
java Main
Hasil Output

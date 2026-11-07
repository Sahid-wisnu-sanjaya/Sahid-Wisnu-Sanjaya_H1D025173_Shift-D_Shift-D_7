# Responsi Pemrograman Berbasis Objek

Nama : Sahid Wisnu Sanjaya  
NIM : H1D025173  
SHIFT AWAL : D  
SHIFT AKHIR : D  

# Tema Sistem Rumah Sakit (RS Kuru Kuru)
## Alur Program

1. **Inisialisasi & Pembuatan Objek**  
   Program dijalankan melalui class `Main.java` yang membuat dua objek pegawai RS Kuru Kuru dari abstract class `PegawaiRS`: Dokter **dr. Hatsune Miku** (`Dokter`) spesialis anak dan Perawat **Budi, S.Kep** (`Perawat`) di Ruang Mawar.
2. **Informasi Awal Pegawai**  
   Menampilkan informasi lengkap masing-masing pegawai (ID, nama, jam kerja, tarif, jabatan, bonus/shift) menggunakan method `tampilkanInformasi()` yang di-override pada subclass dengan memanggil `super.tampilkanInformasi()`.
3. **Simulasi Pelayanan Pasien & Perubahan State**  
   Objek `drHatsune` memanggil method `rawatPasien()` beberapa kali untuk menambah nilai state `jumlahPasien`. Perubahan state ini memicu recalculation gaji via `prosesGaji()` dan logika percabangan `if-else` (memberikan Bonus Kinerja Terlampaui Rp500.000 saat `jumlahPasien > 10`).
4. **Proses Gaji & Tunjangan Shift**  
   Masing-masing subclass memproses gaji sesuai ketentuannya: Dokter menghitung bonus akumulasi pasien, sedangkan Perawat menambahkan tunjangan shift malam (Rp150.000) jika `isShiftMalam` bernilai `true`.
5. **Polimorfisme & Multiple Interface**  
   Menguji eksekusi method melalui variabel referensi interface `LayananKesehatan` dan `SistemTagihan`. Interface `LayananKesehatan` memanggil `rawatPasien()`, sementara `SistemTagihan` (diimplementasikan oleh `Dokter` bersama interface lainnya) memanggil `hitungTotalBiaya()`.
6. **Menampilkan Rekapitulasi Akhir**  
   Program mencetak rekapitulasi status akhir total pasien dan kalkulasi estimasi tagihan secara rapi di konsol.

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

### 1. Clone Repository Github
```bash
git clone [https://github.com/Sahid-wisnu-sanjaya/RumahSakitKuruKuru](https://github.com/Sahid-wisnu-sanjaya/RumahSakitKuruKuru)
```
### 2. Masuk ke Folder Repository
```bash
cd RumahSakitSuki
```
### 3. Compile Program
```bash
javac *.java
```
### 4. Jalankan Program
```bash
java Main
```
## Hasil Output
<img width="565" height="660" alt="Screenshot 2026-11-07 232229" src="https://github.com/user-attachments/assets/9ab4cf97-611d-4ffa-a57b-ef198aa41997" />

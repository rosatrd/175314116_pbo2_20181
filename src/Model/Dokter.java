/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rosa
 */
public class Dokter  extends Pasien{

    private String nomorPegawai; // mendeklarasikan variable nomorpegawai dengan tipe data string .
    private String nama;// mendeklarasikan variable nama dengan tipe data string .
    private String alamat;// mendeklarasikan variable alamat dengan tipe data string .
    private String Tempatlahir; // mendeklarasikan variable tempatlahir dengan tipe data string .
    private int Tanggallahir; // mendeklarasikan variable tanggallahir dengan tipe data int .
    private int bulanLahir; // mendeklarasikan variable bulanlahir dengan tipe data int .
    private int tahunLahir; // mendeklarasikan variable tahunlahir dengan tipe data int .


    public Dokter() { //membuat constructor dengan parameter kosong yang akan otomatis dipanggil jika suatu objek dibuat

    }

    public String getNomorPegawai() { // memanggil method getNomorPegawai dengan tipe data string.
        return nomorPegawai; //Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setNomorPegawai(String nomorPegawai) { // mengisi data ke dalam atribut.
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() { // memanggil method getNama dengan tipe data string.
        return nama;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setNama(String nama) {// mengisi data ke dalam atribut.
        this.nama = nama;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public String getAlamat() {// memanggil method getAlamat dengan tipe data string.
        return alamat;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setAlamat(String alamat) {// mengisi data ke dalam atribut.
        this.alamat = alamat;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public String getTempatlahir() { // memanggil method getTempatLahir dengan tipe data string.
        return Tempatlahir;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setTempatlahir(String Tempatlahir) {// mengisi data ke dalam atribut.
        this.Tempatlahir = Tempatlahir;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public int getTanggallahir() { // memanggil method getTanggalLahir dengan tipe data int.
        return Tanggallahir;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setTanggallahir(int Tanggallahir) {// mengisi data ke dalam atribut.
        this.Tanggallahir = Tanggallahir;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public int getBulanLahir() { // memanggil method getBulanLahir dengan tipe data int.
        return bulanLahir;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setBulanLahir(int bulanLahir) {// mengisi data ke dalam atribut.
        this.bulanLahir = bulanLahir;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public int getTahunLahir() {// memanggil method getTahunLahir dengan tipe data int.
        return tahunLahir;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setTahunLahir(int tahunLahir) {// mengisi data ke dalam atribut.
        this.tahunLahir = tahunLahir;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public void getKelahiran() { // memanggil method getKelahiran dengan tipe data void.
        Date Tanggallahir = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggallahir());// mengeset data tahun lahir, bulan lahir dan tanggal lahir
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");// membuat tampilan atau format .
        System.out.println(ft.format(Tanggallahir));// menampilkan data sesuai dengan format yang telah di buat.

    }
}
//     
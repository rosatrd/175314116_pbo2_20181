/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianKlinik;
import Model.Pasien;
import Model.klinik;

/**
 *
 * @author Rosa
 */
public class TestAntrianKlinik {

    public static void main(String[] args) {

        AntrianKlinik.BuatAntrian(14, 2, 2017, new klinik("001", "Anak"));
        AntrianKlinik.BuatAntrian(21, 9, 2018, new klinik("001", "Anak"));
        AntrianKlinik.BuatAntrian(21, 9, 2018, new klinik("002", "Saraf"));
        AntrianKlinik.BuatAntrian(21, 9, 2018, new klinik("001", "Anak"));

        for (int i = 0; i < AntrianKlinik.daftarAntrian.size(); i++) {
            System.out.println(AntrianKlinik.daftarAntrian.get(i));
        }
        System.out.println("\n");

        Pasien pas1 = new Pasien();
        pas1.setNama("Puspa");
        pas1.setNoRekamMedis("1000");
        pas1.setAlamat("Klaten");

        Pasien pas2 = new Pasien();
        pas2.setNama("Adi");
        pas2.setNoRekamMedis("1100");
        pas2.setAlamat("Klaten");

        Pasien pas3 = new Pasien();
        pas3.setNama("Budi");
        pas3.setNoRekamMedis("1110");
        pas3.setAlamat("Klaten");

        int indeksAntrian = AntrianKlinik.CariAntrian(21, 9, 2018, new klinik("001", "Anak"));
        if (indeksAntrian >= 0) {
            AntrianKlinik.daftarAntrian.get(indeksAntrian).mendaftar(pas1);
            AntrianKlinik.daftarAntrian.get(indeksAntrian).mendaftar(pas2);
            AntrianKlinik.daftarAntrian.get(indeksAntrian).mendaftar(pas3);
        }

        System.out.println(AntrianKlinik.CariPasien("1110").getNama());
        System.out.println("");

        System.out.println(AntrianKlinik.daftarAntrian.get(indeksAntrian).getKlinik().getIdklinik() + ", " + AntrianKlinik.daftarAntrian.get(indeksAntrian).getKlinik().getNama());
        for (int i = 0; i < AntrianKlinik.daftarAntrian.get(indeksAntrian).getDaftarPasien().size(); i++) {
            System.out.println(AntrianKlinik.daftarAntrian.get(indeksAntrian).getDaftarPasien().get(i).getNama());
        }
        System.out.println("");

    }

}

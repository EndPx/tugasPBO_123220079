/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author abaym
 */
public class MPV extends mobil {
   private int kapasitas;
   private boolean kursiBelakang;

   public MPV(String merk, String warna, int tahun, int kapasitas, boolean kursiBelakang) {
       super(merk, warna, tahun);
       this.kapasitas = kapasitas;
       this.kursiBelakang = kursiBelakang;
   }

   public int getKapasitas() {
       return kapasitas;
   }

   public void setKapasitas(int kapasitas) {
       this.kapasitas = kapasitas;
   }

   public boolean isKursiBelakang() {
       return kursiBelakang;
   }

   public void setKursiBelakang(boolean kursiRemang) {
       this.kursiBelakang = kursiBelakang;
   }
   
   @Override
   public void tampilInfo() {
       System.out.println("Merk: " + getMerk());
       System.out.println("Warna: " + getWarna());
       System.out.println("Tahun: " + getTahun());
       System.out.println("Kapasitas: " + getKapasitas());
       System.out.println("Kursi Remang: " + isKursiBelakang() );
   }
}

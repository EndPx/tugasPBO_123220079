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
public class sedan extends mobil {
    private int kapasitas;

    public sedan(String merk, String warna, int tahun, int kapasitas) {
        super(merk, warna, tahun);
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Merk: " + getMerk());
        System.out.println("Warna: " + getWarna());
        System.out.println("Tahun: " + getTahun());
        System.out.println("Kapasitas: " + getKapasitas());
    }
}

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
public class SUV extends mobil {
    private int kapasitas;
    private boolean rodaSerep;

    public SUV(String merk, String warna, int tahun, int kapasitas, boolean rodaSerep) {
        super(merk, warna, tahun);
        this.kapasitas = kapasitas;
        this.rodaSerep = rodaSerep;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public boolean isRodaSerep() {
        return rodaSerep;
    }

    public void setRodaSerep(boolean rodaSerep) {
        this.rodaSerep = rodaSerep;
    }
    
    public void gantiBan() {
        if(isRodaSerep()) {
            System.out.println(getMerk() + " Melakukan Ganti Ban");
        } else {
            System.out.println(getMerk() + "Tidak dapat melakukan ganti ban");
        }
    } 

    @Override
    public void tampilInfo() {
        System.out.println("Merk: " + getMerk());
        System.out.println("Warna: " + getWarna());
        System.out.println("Tahun: " + getTahun());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Roda Serep? " + isRodaSerep());
    }
}
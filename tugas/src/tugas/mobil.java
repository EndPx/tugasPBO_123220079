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
public abstract class mobil {
    private String merk;
    private String warna;
    private int tahun;

    public mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    abstract void tampilInfo();
    
    public void maju() {
        System.out.println("Mobil Maju");
    }
    
    public void rem() {
        System.out.println("Mobil berusaha berhenti");
    }

    public void gantiBan() {
        System.out.println(getMerk() + " Tidak dapat melakukan ganti ban");
    }
}
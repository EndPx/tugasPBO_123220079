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
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mobil K[] = new mobil[3];
        K[0] = new sedan("Audi" ,"biru", 2019, 5);
        K[1] = new MPV("Toyota", "putih", 2020, 7, true);
        K[2] = new SUV("Mitshubishi", "putih", 2023, 7, true);
        
        for(int i = 0; i < 3; i++){
            K[i].tampilInfo();
            K[i].maju();
            K[i].rem();
            K[i].gantiBan();
            System.out.println();
        }
    }
}

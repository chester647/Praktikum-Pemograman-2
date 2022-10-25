/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal1;
import java.util.Scanner;
/**
 *
 * @author ranow
 */

public class Praktikum3Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Membuat objek scanner
        Dadu d = new Dadu(); //objek class
        int jumlah_dadu = input.nextInt();
        
        d.setInput(jumlah_dadu);
        d.acak();
    }
    
}

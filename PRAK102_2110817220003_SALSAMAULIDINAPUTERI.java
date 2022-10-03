/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1salsa;
import java.util.Scanner;
/**
 *
 * @author ranow
 */
public class PRAK102_2110817220003_SALSAMAULIDINAPUTERI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        int angka, hasil;
        
        System.out.print("Angka: ");
        angka = input.nextInt();
        
        int i = 0;
        while (6 >= i) {
            if (angka % 2 == 0){
                hasil = (angka/2)-1;
                System.out.print(hasil);
            } else {
                System.out.print(angka);
            }
            
            if(i < 6){
                System.out.print(", ");
            } else {
                System.out.println("");
            }
            angka++;
            i++;
            input.close();
            }
}
}
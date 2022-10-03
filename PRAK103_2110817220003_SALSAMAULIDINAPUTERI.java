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
public class PRAK103_2110817220003_SALSAMAULIDINAPUTERI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        int angka ;
        
        System.out.print("Angka: ");
        angka = input.nextInt();
        
        int i;
        i = 1;
        do {
            if (angka % 7 == 0){
                continue;
            } 
            if (i < 6) {System.out.print(angka);
            }else { 
                System.out.print(angka);
            }
        
            if(i < 5){
                System.out.print(", ");
            } else {
                System.out.println("");
            }
            
            angka--;
            i++;
            input.close();
        }while (i < 6);
    }
}
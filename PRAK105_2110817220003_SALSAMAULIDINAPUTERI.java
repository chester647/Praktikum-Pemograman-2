/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1salsa;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author ranow
 */
public class PRAK105_2110817220003_SALSAMAULIDINAPUTERI {
     public static final double PHI = 3.14;
    public static void main(String[] args){
        double jari, tinggi, volume;
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukan jari-jari: ");
        jari = input.nextDouble();
        
        System.out.print("Masukan tinggi: ");
        tinggi = input.nextDouble();
        
        volume = PHI * jari * jari * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jari + " cm dan");
        System.out.println("tinggi "+ tinggi + " cm adalah " + volume + " m3");
    }
    
}
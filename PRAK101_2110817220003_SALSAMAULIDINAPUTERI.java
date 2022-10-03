/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1salsa;
import java.util.Scanner;

/**
 *
 * @author ranow
 */
public class PRAK101_2110817220003_SALSAMAULIDINAPUTERI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, tl;
        int tgl, tahun, bulan, tinggi;
        float bb;
        
        Scanner input = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Nama Lengkap: ");
    nama = input.nextLine();
    
    System.out.print("Tempat Lahir: ");
    tl = input.nextLine();
    
    System.out.print("Tanggal Lahir: ");
    tgl = input.nextInt();
    
    System.out.print("Bulan Lahir: ");
    bulan = input.nextInt();

    System.out.print("Tahun Lahir: ");
    tahun = input.nextInt();
    
    System.out.print("Tinggi Badan: ");
    tinggi = input.nextInt();
    
    System.out.print("Berat Badan: ");
    bb = input.nextFloat();
    
    String namabulan = null;
        switch (bulan) {
            case 1 -> namabulan = "Januari";
            case 2 -> namabulan = "Februari";
            case 3 -> namabulan = "Maret";
            case 4 -> namabulan = "April";
            case 5 -> namabulan = "Mei";
            case 6 -> namabulan = "Juni";
            case 7 -> namabulan = "Juli";
            case 8 -> namabulan = "Agustus";
            case 9 -> namabulan = "September";
            case 10 -> namabulan = "Oktober";
            case 11 -> namabulan = "November";
            case 12 -> namabulan = "Desember";
                default -> System.out.println("Tidak Tersedia");
        }
    
        System.out.println("Data Telah Ditambahkan");
        System.out.print("Nama Lengkap " + nama);
        System.out.print(", Lahir di " + tl);
        System.out.println(" pada Tanggal " + tgl +" "+ namabulan +" "+ tahun );
        System.out.println("Tinggi Badan " + tinggi + " cm" + " dan Berat Badan " + bb + " kilogram");
 
    }
    
}
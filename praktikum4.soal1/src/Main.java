/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ranow
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //deklarasi new scanner
       Scanner input = new Scanner(System.in);
       String j, p;
       Integer t;
       
       //input user
        System.out.print("Judul: ");
        j = input.nextLine();
        
        System.out.print("Penulis: ");
        p = input.nextLine();
        
        System.out.print("Tahun Terbit: ");
        t = input.nextInt();
        
        //deklarasi objek baru
        Buku b = new Buku(j,p,t);
        b.display();
    }
    
}

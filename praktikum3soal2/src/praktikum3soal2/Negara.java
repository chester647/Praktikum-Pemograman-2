/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3soal2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ranow
 */
public class Negara {
    private String nama, jeniskepemimpinan, namapemimpin;
    private int tanggalkemerdekaan, bulankemerdekaan, tahunkemerdekaan;
    
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int 
tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
 this.nama = nama;
 this.jeniskepemimpinan = jenisKepemimpinan;
 this.namapemimpin = namaPemimpin;
 this.tanggalkemerdekaan = tanggalKemerdekaan;
 this.bulankemerdekaan = bulanKemerdekaan;
 this.tahunkemerdekaan = tahunKemerdekaan;
 }

    public int getBulankemerdekaan() {
        return bulankemerdekaan;
    }

  void getData(){
      Scanner input= new Scanner(System.in);
      nama = input.nextLine();
      jeniskepemimpinan = input.nextLine();
      namapemimpin = input.nextLine();
      
      if (jeniskepemimpinan.equalsIgnoreCase("presiden")||jeniskepemimpinan.equalsIgnoreCase("perdana menteri")){
          tanggalkemerdekaan = input.nextInt();
          bulankemerdekaan = input.nextInt();
          tahunkemerdekaan = input.nextInt();
      }
  }
  
  void show(){
      HashMap<Integer, String> bulankemerdekaan = new HashMap<Integer, 
String>();
 bulankemerdekaan.put(1, "Januari");
 bulankemerdekaan.put(2, "Februari");
 bulankemerdekaan.put(3, "Maret");
 bulankemerdekaan.put(4, "April");
 bulankemerdekaan.put(5, "Mei");
 bulankemerdekaan.put(6, "Juni");
 bulankemerdekaan.put(7, "Juli");
 bulankemerdekaan.put(8, "Agustus");
 bulankemerdekaan.put(9, "September");
 bulankemerdekaan.put(10, "Oktober");
 bulankemerdekaan.put(11, "November");
 bulankemerdekaan.put(12, "Desember");
 
 System.out.println(" ");

 if(jeniskepemimpinan.equalsIgnoreCase("presiden")){
     System.out.println("Negara "+nama+" mempunyai Presiden "+namapemimpin);
 }
 
 else if(jeniskepemimpinan.equalsIgnoreCase("perdana menteri")){
     System.out.println("Negara "+ nama + " mempunyai Perdana Menteri bernama "+namapemimpin);
 }
 
 else if (jeniskepemimpinan.equalsIgnoreCase("monarki")){
 System.out.println("Negara " + nama + " mempunyai Raja bernama " + 
namapemimpin);
 }
 
 if 
(jeniskepemimpinan.equalsIgnoreCase("presiden")||jeniskepemimpinan.equalsIgnoreCase("perdana menteri")){
 System.out.println("Deklarasi Kemerdekaan pada Tanggal " + 
tanggalkemerdekaan + " " + bulankemerdekaan.get(getBulankemerdekaan()) + " " + 
tahunkemerdekaan);
 }
 
}
}
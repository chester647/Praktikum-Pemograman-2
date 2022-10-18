/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak201.pkg2110817220003.salsamaulidinaputeri;

/**
 *
 * @author ranow
 */
public class mangga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //object class Buah
        Buah mangga1 = new Buah();
        Buah mangga2 = new Buah();
        Buah mangga3 = new Buah();
        
        //set nilai property dengan method setter
        mangga1.setNama("Arumanis");
        mangga1.setBerat((float) 0.3);
        mangga1.setHarga(5000);
        mangga1.setJumlah_beli(13);
        mangga1.setTotal_berat(mangga1.berat * mangga1.jumlah_beli);
        mangga1.setTotal_harga(mangga1.harga * mangga1.jumlah_beli);
        
        mangga2.setNama("Manalagi");
        mangga2.setBerat((float) 0.5);
        mangga2.setHarga(7500);
        mangga2.setJumlah_beli(17);
        mangga2.setTotal_berat(mangga2.berat * mangga2.jumlah_beli);
        mangga2.setTotal_harga(mangga2.harga * mangga2.jumlah_beli);
        
        mangga3.setNama("Mangga Madu");
        mangga3.setBerat((float) 0.375);
        mangga3.setHarga(6500);
        mangga3.setJumlah_beli(12);
        mangga3.setTotal_berat(mangga3.berat * mangga3.jumlah_beli);
        mangga3.setTotal_harga(mangga3.harga * mangga3.jumlah_beli);
        
        //tampilkan property dengan method getter
        System.out.println("Nama Mangga: " + mangga1.getNama());
        System.out.println("Berat: "+ mangga1.getBerat()+" kg");
        System.out.println("Jumlah Beli: "+ mangga1.getJumlah_beli());
        System.out.println("Total berat :"+ mangga1.getTotal_berat()+" kg");
        System.out.println("Total Harga: Rp."+mangga1.getTotal_harga());
        
        System.out.println();
        
        System.out.println("Nama Mangga: " + mangga2.getNama());
        System.out.println("Berat: "+ mangga2.getBerat()+" kg");
        System.out.println("Jumlah Beli: "+ mangga2.getJumlah_beli());
        System.out.println("Total berat: "+ mangga2.getTotal_berat()+" kg");
        System.out.println("Total Harga: Rp."+mangga2.getTotal_harga());
        
        System.out.println();
        
        System.out.println("Nama Mangga: " + mangga3.getNama());
        System.out.println("Berat: "+ mangga3.getBerat()+" kg");
        System.out.println("Jumlah Beli: "+ mangga3.getJumlah_beli());
        System.out.println("Total berat: "+ mangga3.getTotal_berat()+" kg");
        System.out.println("Total Harga: Rp."+mangga3.getTotal_harga());
         
        System.out.println();
    }  
}
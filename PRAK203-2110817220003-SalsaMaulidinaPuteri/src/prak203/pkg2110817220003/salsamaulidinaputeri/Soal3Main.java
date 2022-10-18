/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak203.pkg2110817220003.salsamaulidinaputeri;

/**
 *
 * @author ranow
 */
public class Soal3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        
        //baris ini kurang tanda ;
 //p1.nama = "Roi"
 p1.nama = "Roi";
 p1.asal = "Kingdom of Orvel";
 p1.umur = 17;
 p1.setJabatan("Assasin");
 
 //Print output diubah menjadi Nama saja
 //System.out.println("Nama Pegawai: " + p1.getNama());
 System.out.println("Nama: " + p1.getNama());
 System.out.println("Asal: " + p1.getAsal());
 //baris ini kurang tanda ;
 //System.out.println("Jabatan: " + p1.jabatan)
 System.out.println("Jabatan: " + p1.jabatan);
 //pernyataan p1.umur error karena tidak ada nilai propertynya dan perlu ditambah kalimat umur pada ujung outputnya.
 //System.out.println("Umur: " + p1.umur);
 System.out.println("Umur: " + p1.umur + " tahun");
    }
    
}

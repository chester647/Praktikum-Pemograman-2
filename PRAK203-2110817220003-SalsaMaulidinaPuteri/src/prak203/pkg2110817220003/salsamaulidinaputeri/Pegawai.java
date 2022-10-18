/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak203.pkg2110817220003.salsamaulidinaputeri;

/**
 *
 * @author ranow
 */
public class Pegawai {
    public String nama;
 //property asal diubah menjadi tipe data String agar sesuai dengan methodnya
 //public char asal;
 public String asal;
 public String jabatan;
 public int umur;
 public String getNama() {
 return nama;
 }
 public String getAsal() {
 return asal;
 }
 /** Agar baris this.jabatan = j tidak error,
 perlu ditambahkan argumen yang sesuai dengan tipe data
 parameternya yaitu String
 */
 //public void setJabatan()
 public void setJabatan(String j){
 this.jabatan = j;
 }
}
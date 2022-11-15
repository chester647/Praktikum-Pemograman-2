/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ranow
 */
public class Buku {
    public String judul, penulis;
    public Integer tahun;
    
//constructor
public Buku(String j, String p, Integer t){
    this.judul = j;
    this.penulis = p;
    this.tahun = t;
}    

//method dosplay
public void display(){
    System.out.println("Detail Buku: ");
    System.out.println("Judul adalah "+ judul);
    System.out.println("Penulis adalah "+penulis);
    System.out.println("Tahun Terbit adalah "+tahun);
}
}

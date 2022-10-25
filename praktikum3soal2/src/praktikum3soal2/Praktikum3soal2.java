/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3soal2;

import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author ranow
 */
public class Praktikum3soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama= " ", jeniskepemimpinan= " ",namapemimpin= " ";
        int tanggalkemerdekaan= 0, bulankemerdekaan= 0, tahunkemerdekaan= 0;
        
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> Negara = new LinkedList<>();
        
        int ulang;
 ulang = input.nextInt();
 
 for (int i = 0; i < ulang; i++){
 Negara inputNegara = new Negara(nama, jeniskepemimpinan, namapemimpin, 
tanggalkemerdekaan, bulankemerdekaan, tahunkemerdekaan);
 inputNegara.getData();
 Negara.add(inputNegara);
 }
 
 for (int i = 0; i < Negara.size(); i++){
 Negara printNegara = Negara.get(i);
 printNegara.show();
 }
    }
    
}

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
public class PRAK104_2110817220003_SALSAMAULIDINAPUTERI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        int andisatu, andidua, anditiga, budisatu, budidua, buditiga;

        
        System.out.print("Kartu Andi: ");
        andisatu = input.nextInt();
        andidua = input.nextInt();
        anditiga = input.nextInt();
        int andi;
        andi = andisatu + andidua + anditiga;
        
        System.out.print("Kartu Budi: ");
        budisatu = input.nextInt();
        budidua = input.nextInt();
        buditiga = input.nextInt();
        int budi;
        budi = budisatu + budidua + buditiga;
        
                
         if ((andisatu >= 2 && andisatu <= 10) && (andidua >= 2 && andidua <=10) && (anditiga <=10 && anditiga >=2) &&
            (budisatu >= 2 && budisatu <=10) && (budidua >= 2 && budidua <=10) && (buditiga >= 2 && buditiga <=10))

        
        if (andi > budi){
            System.out.println("Andi");
        } else if (andi == budi){
            System.out.println("Seri");
        }
        else {
            System.out.println("Budi");
             }
         else  {
            System.out.println("Kartu Hanya Bisa 2-10");
            } 
   }
}
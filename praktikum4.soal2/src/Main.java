 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ranow
 */
public class Main {
    public static void main(String[] args) {
        Integer angka;
        
        Scanner input=new Scanner(System.in);
        
        angka=input.nextInt();
        input.nextLine();
        System.out.println("Pilih buku yang ingin diinputkan ");
        System.out.println("1=Novel");
        System.out.println("2=Komik");
        System.out.print("Masukkan Pilihan: ");
        
        switch (angka) {
            case 1 ->                 {
                    String judul, penulis, tahun, genre, sinopsis;
                    System.out.print("Judul: ");
                    judul = input.nextLine();
                    System.out.print("Penulis: ");
                    penulis = input.nextLine();
                    System.out.print("Tahun Terbit: ");
                    tahun = input.nextLine();
                    System.out.print("Genre: ");
                    genre = input.nextLine();
                    System.out.print("Sinopsis: ");
                    sinopsis = input.nextLine();
                    Novel n = new Novel(judul, penulis, tahun, genre, sinopsis);
                    System.out.println(n.getNovelDetail());
                }
            case 2 ->                 {
                    String judul, penulis, tahun, sinopsis;
                    int volume;
                    System.out.print("Judul: ");
                    judul = input.nextLine();
                    System.out.print("Penulis: ");
                    penulis = input.nextLine();
                    System.out.print("Tahun Terbit: ");
                    tahun = input.nextLine();
                    System.out.print("Volume: ");
                    volume = input.nextInt();
                    input.nextLine();
                    System.out.print("Sinopsis: ");
                    sinopsis = input.nextLine();
                    Komik k = new Komik(judul, penulis, tahun, volume, sinopsis);
                    System.out.println(k.getKomikDetail());
                }
            default -> System.out.println("Tidak ada di daftar pilihan");
        }
    }
    
}

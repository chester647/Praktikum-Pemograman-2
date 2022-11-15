/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ranow
 */
public class Novel extends Buku {
    private String genre, sinopsis;
    
    public Novel (String j, String p, String t, String g, String s){
        super.judul=j;
        super.penulis=p;
        super.tahun=Integer.valueOf(t);
        this.genre=g;
        this.sinopsis=s;
    }
    
    public String getNovelDetail(){
        return """
               Data yang baru diinputkan adalah 
               Sebuah novel bergenre """ + genre + " dengan judul \"" + judul + "\".\n"
 + "Novel tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + 
tahun + ".\n"
 + "Sinopsis : " + sinopsis.substring(0, 59) + "....";
    }
}

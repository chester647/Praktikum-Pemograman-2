/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak202.pkg2110817220003.salsamaulidinaputeri;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author ranow
 */
public class Mobil {
    //property class Mobil
    String merek, tahun_keluaran;
    int kapasitas;
    int harga;
    private String Pemilik;

    public String getPemilik() {
        return Pemilik;
    }

    public void setPemilik(String Pemilik) {
        this.Pemilik = Pemilik;
    }

    public int getHarga() {
        return harga;
    }


    public String getPajak() {
        String Pajak = templaterp.format(this.harga * 2/100);
        return Pajak;
    }
    
    DecimalFormat templaterp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

      
    
    public void info(){
         formatRp.setCurrencySymbol(" ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        templaterp.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Merek Mobil: "+merek);
        System.out.println("Harga: Rp."+ templaterp.format(harga));
        System.out.println("Tahun keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: "+kapasitas+"cc");
    }

    
}   
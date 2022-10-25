/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

import java.util.LinkedList;

/**
 *
 * @author ranow
 */
class Dadu {
    private int input, total;
   private int min = 1;
   private int max = 6;

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
   void acak(){
       LinkedList<Integer> dadu = new LinkedList<>();
        dadu.add(1);dadu.add(2);dadu.add(3);dadu.add(4);dadu.add(5);dadu.add(6);
        for (int i = 0; i < input; i++){
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai "+ random_int);
            total += random_int;
        }
        System.out.println("Total Nilai Dadu Keseluruhan "+ total);
   } 
}

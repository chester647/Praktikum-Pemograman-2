/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.soal1;

/**
 *
 * @author ranow
 */
public abstract class shape {
    protected String shapeName;
    
    public shape(String name) {
        shapeName = name;
    }
    
    protected abstract double area ();
    
    public String toString() {
        return shapeName;
    }
}

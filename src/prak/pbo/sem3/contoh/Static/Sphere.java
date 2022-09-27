/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak.pbo.sem3.contoh.Static;

/**
 *
 * @author hanschristian
 */
public class Sphere {
    
    static double T = 250;
    
    // Attributes
    int x;
    int y;
    
    public Sphere() {
        hitung();
    }

    public Sphere(int x, int y) {
        this.x = x;
        this.y = y;
        hitung();
    }
    
    // Methods
    public Double hitung() {
        return (x + y) * new Constants().PI;
    }
    
    static void hitungABC() {
        
    }
}

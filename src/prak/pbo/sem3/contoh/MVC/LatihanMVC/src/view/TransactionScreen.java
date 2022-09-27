/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author hanschristian
 */
public class TransactionScreen {
    
    public TransactionScreen() {
        
        // edit text harga <- input dari user
        int harga = Integer.parseInt(JOptionPane.showInputDialog(null, "Input harga"));
        // edit text jumlah <- input dari user
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog(null, "Input jumlah"));
        // button hitung <- user klik button hitung total setelah menginput harga barang & jumlah
        
        Controller c = new Controller();
        double total = c.hitungTotal(harga, jumlah);
        
        JOptionPane.showMessageDialog(null, total);
    }
}

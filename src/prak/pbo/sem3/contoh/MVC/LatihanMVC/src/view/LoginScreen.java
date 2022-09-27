/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Book;

/**
 *
 * @author hanschristian
 */
public class LoginScreen {
    
    public LoginScreen() {
        // Show UI for Login Screen
        
        Book book = new Book();
        book.setPages(50);
        
        Controller controller = new Controller();
        ArrayList<Book> books = controller.getBooks();
        // tampilkan list buku dalam GUI
        JOptionPane.showMessageDialog(null, "Ini adalah LoginScreen untuk Buku yang " + book.cekKetebalanBuku(), "Title", 0);
    }
    
    private void showBooks() {
        // textViewTitle.text = books.get(i).getTitle();
    }
    
    private int hitungXYZ() {
        return 0;
    }
}

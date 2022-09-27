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
public class RegisterScreen {
    
    public RegisterScreen() {
        // Show UI for Register
        
        Controller controller = new Controller();
        ArrayList<Book> books = controller.getBooks();
        
        Book newBook = new Book();
        newBook.setTitle(JOptionPane.showInputDialog(null, "Input book title"));
        newBook.setISBN(JOptionPane.showInputDialog(null, "Input book ISBN"));
        
        boolean isSuccess = controller.insertBook(newBook);
        if(isSuccess) {
            JOptionPane.showMessageDialog(null, "Insert berhasil", "Title", 0);
        } else {
            JOptionPane.showMessageDialog(null, "Insert gagal", "Title", 0);
        }
        
        JOptionPane.showMessageDialog(null, "Ini adalah RegisterScreen", "Title", 0);
    }
}

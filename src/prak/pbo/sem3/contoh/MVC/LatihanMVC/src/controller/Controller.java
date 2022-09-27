/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author hanschristian
 */
public class Controller {
    
    public Controller() {
    }
    
    // bisa berisi method-method yang sifatnya global
    // dipakai di banyak tempat
    // parameter nya juga multiple objects
    public String methodGeneral(Book book, Newspaper np) {
        return "";
    }
    
    // database query
    public ArrayList<Book> getBooks() {
        // query ke database, get dalam bentuk arrayList of Book
        return new ArrayList<Book>();
    }
    
    public boolean insertBook(Book book) {
        // query ke database, insert into books values()
//        boolean isSuccess = database.success;
        return true;
    }
    
    public double hitungTotal(int harga, int quantity) {
        return harga * quantity * 1.15;
    }
}

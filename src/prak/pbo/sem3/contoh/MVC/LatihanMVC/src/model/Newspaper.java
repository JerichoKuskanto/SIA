/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author hanschristian
 */
public class Newspaper {
    // best practice: attributes selalu private
    private String name;
    private int edisi;
    private Date date;
    
    // cara initialize data pertama pakai constructor ketika object dibuat
    public Newspaper(String name, int edisi, Date date) {
        if(edisi != 10) {
            this.name = name;
            this.edisi = edisi;
            this.date = date;
        } else {
            this.name = "";
        }
    }
    
    // cara kedua untuk memodifikasi dan mendapatkan value dari attributes adalah menggunakan getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // bisa menambahkan validasi atau logic lain
        if(name.equals("Badrun")) {
            this.name = name;
        }
    }

    public int getEdisi() {
        if(edisi < 10) {
            return 0;
        } else {
            return edisi;
        }
    }

    public void setEdisi(int edisi) {
        this.edisi = edisi;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

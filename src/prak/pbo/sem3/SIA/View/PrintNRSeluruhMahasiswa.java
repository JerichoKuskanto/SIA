package prak.pbo.sem3.SIA.View;

import prak.pbo.sem3.SIA.model.*;
import prak.pbo.sem3.SIA.model.Matkul.*;
import prak.pbo.sem3.SIA.Controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrintNRSeluruhMahasiswa {

    public PrintNRSeluruhMahasiswa(ArrayList<User> user, ArrayList<Matakuliah> matkul, ArrayList<MatkulAmbil> matkulambil) {
        PrintNR(user, matkul, matkulambil);
    }

    private String inputKodeMK() {
        String KodeMK = JOptionPane.showInputDialog(null, "masukan KodeMK");
        return KodeMK;
    }

    private void PrintNR(ArrayList<User> user, ArrayList<Matakuliah> matkul, ArrayList<MatkulAmbil> matkulambil) {
        Controller controler = new Controller();
        String kodemk = inputKodeMK();

        boolean cek = controler.cekMatkulFromKode(matkul, kodemk);
        if (cek) {
            String text = "";
            boolean ada = false;
            for (int i = 0; i < user.size(); i++) {
                if (user.get(i) instanceof Mahasiswa) {
                    Mahasiswa mhs = (Mahasiswa) user.get(i);
                    if (controler.cekIkutMatkul(mhs, kodemk)) {
                        text += "Nama :" + user.get(i).getNama();
                        int nilai = controler.hitungrataMHS(mhs, kodemk);
                        text += "\nNilai: " + nilai + "\n";
                        ada = true;
                    }
                }
            }
            if (ada == false) {
                text = "Tidak ada yang mengikuti Matakuliah yang dicari";
            }
            JOptionPane.showMessageDialog(null, text);
        } else {
            JOptionPane.showMessageDialog(null, "Mata Kuliah tidak ditemukan dalam sistem!", "Error", 1);
        }
    }
}

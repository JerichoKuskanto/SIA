package prak.pbo.sem3.SIA.View;

import prak.pbo.sem3.SIA.model.*;
import prak.pbo.sem3.SIA.model.Masiswa.*;
import prak.pbo.sem3.SIA.model.Matkul.*;
import prak.pbo.sem3.SIA.Controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrintNilaiAkhir {

    public PrintNilaiAkhir(ArrayList<User> user, ArrayList<Matakuliah> matkul, ArrayList<MatkulAmbil> matkulambil) {
        PrintNilai(user, matkul);
    }

    private String inputNim() {
        String Nim = JOptionPane.showInputDialog(null, "masukan Nim");
        return Nim;
    }

    private String inputKodeMK() {
        String KodeMK = JOptionPane.showInputDialog(null, "masukan KodeMK");
        return KodeMK;
    }

    private void PrintNilai(ArrayList<User> user, ArrayList<Matakuliah> matkul) {
        Controller controler = new Controller();
        String nim = inputNim();
        Mahasiswa mhs = controler.getMahasiswaFromNim(user, nim);
        if (mhs instanceof MahasiswaDoktor) {
            MahasiswaDoktor mhsDoktor = (MahasiswaDoktor) mhs;
            int nilai = controler.hitungRataDoktor(mhsDoktor);
            String text = "Nilai Rata Sidang: ";
            text += nilai;
            JOptionPane.showMessageDialog(null, text);
        } else {
            String kodemk = inputKodeMK();
            boolean cek = controler.cekMatkulFromKode(matkul, kodemk);
            if (cek) {
                if (controler.cekIkutMatkul(mhs, kodemk)) {
                    int nilai = controler.hitungrataMHS(mhs, kodemk);
                    String text = "Nilai Rata Matakuliah: ";
                    text += nilai;
                    JOptionPane.showMessageDialog(null, text);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Mata Kuliah tidak ditemukan dalam sistem!", "Error", 1);
            }
        }
    }
}

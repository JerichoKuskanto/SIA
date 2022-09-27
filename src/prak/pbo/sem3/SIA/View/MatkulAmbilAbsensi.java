package prak.pbo.sem3.SIA.View;

import javax.swing.JOptionPane;
import prak.pbo.sem3.SIA.model.*;
import java.util.ArrayList;
import prak.pbo.sem3.SIA.Controller.Controller;
import prak.pbo.sem3.SIA.model.Masiswa.*;
import prak.pbo.sem3.SIA.model.Matkul.*;

public class MatkulAmbilAbsensi {

    public MatkulAmbilAbsensi(ArrayList<User> user, ArrayList<Matakuliah> matkul, ArrayList<MatkulAmbil> matkulambil) {
        AbsenMatakuliah(user, matkul, matkulambil);
    }

    private String inputNim() {
        String Nim = JOptionPane.showInputDialog(null, "masukan Nim");
        return Nim;
    }

    private void AbsenMatakuliah(ArrayList<User> user, ArrayList<Matakuliah> matkul, ArrayList<MatkulAmbil> matkulambil) {
        Controller controler = new Controller();
        String text = "";
        String nim = inputNim();
        Mahasiswa mhs = controler.getMahasiswaFromNim(user, nim);
        if (mhs instanceof MahasiswaDoktor) {
            JOptionPane.showMessageDialog(null, "Mahasiswa Memiliki Gelar Doktor, tidak bisa menghitung absensi", "Error", 1);
        } else {
            for (int i = 0; i < matkulambil.size(); i++) {
                text = controler.cekJumlahMatkul(mhs, matkulambil.get(i));

            }
            JOptionPane.showMessageDialog(null, text);
        }
    }
}

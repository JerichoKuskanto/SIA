package prak.pbo.sem3.SIA.View;

import prak.pbo.sem3.SIA.model.*;
import prak.pbo.sem3.SIA.model.Matkul.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prak.pbo.sem3.SIA.Controller.Controller;

public class TidakLulus {

    public TidakLulus(ArrayList<User> user, ArrayList<Matakuliah> matkul, ArrayList<MatkulAmbil> matkulambil) {
        PrintKelulusan(user, matkul, matkulambil);
    }

    private String inputKodeMK() {
        String KodeMK = JOptionPane.showInputDialog(null, "masukan KodeMK");
        return KodeMK;
    }

    private void PrintKelulusan(ArrayList<User> user, ArrayList<Matakuliah> matkul, ArrayList<MatkulAmbil> matkulambil) {
        Controller controler = new Controller();
        String kodemk = inputKodeMK();

        boolean cek = controler.cekMatkulFromKode(matkul, kodemk);
        if (cek) {
            String text = "";
            boolean ada = false;
            int jumlahRemed = 0;
            int total = 0;
            for (int i = 0; i < user.size(); i++) {
                if (user.get(i) instanceof Mahasiswa) {
                    Mahasiswa mhs = (Mahasiswa) user.get(i);
                    if (controler.cekIkutMatkul(mhs, kodemk)) {
                        int nilai = controler.hitungrataMHS(mhs, kodemk);
                        if (nilai < 56) {
                            jumlahRemed++;
                        }
                        ada = true;
                        total++;
                    }
                }
            }
            if (ada == false) {
                text = "Tidak ada yang mengikuti Matakuliah yang dicari";
            }
            if (jumlahRemed != 0) {
                text = "Jumlah Mahasiswa yang mengulang = <" + jumlahRemed;
                text += "> dari <" + total +"> Mahasiswa";
            } else {
                text = "Tidak ada yang mengulang";
            }

            JOptionPane.showMessageDialog(null, text);
        } else {
            JOptionPane.showMessageDialog(null, "Mata Kuliah tidak ditemukan dalam sistem!", "Error", 1);
        }
    }
}

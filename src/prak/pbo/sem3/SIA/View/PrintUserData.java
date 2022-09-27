package prak.pbo.sem3.SIA.View;

import javax.swing.JOptionPane;
import prak.pbo.sem3.SIA.model.*;
import prak.pbo.sem3.SIA.Controller.Controller;
import prak.pbo.sem3.SIA.model.Pegawai.*;
import java.util.ArrayList;

public class PrintUserData {

    Controller controllerCheck = new Controller();
    Controller controllerGet = new Controller();

    private String inputNama() {
        String username = JOptionPane.showInputDialog(null, "masukan nama");
        return username;
    }

    public PrintUserData(ArrayList<User> listUser) {
        printData(listUser);
    }

    private void printData(ArrayList<User> listUser) {
        String nama = inputNama();
        boolean adaNama = controllerCheck.checkNama(listUser, nama);
        if (adaNama == true) {
            User temp = controllerGet.getUserFromNama(listUser, nama);
            String text = "Nama\t: " + temp.getNama() + "\n";
            if (temp instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) temp;
                text += "Status\t: Mahasiswa\n";
                text += "NIM\t: " + mhs.getNIM() + "\n";
                text += "Jurusan\t: " + mhs.getJurusan() + "\n";
            } else if (temp instanceof Karyawan) {
                Karyawan staff = (Karyawan) temp;
                text += "Status\t: Karyawan\n";
                text += "NIK\t: " + staff.getNIK() + "\n";
            } else {
                Dosen dosen = (Dosen) temp;
                if (dosen instanceof DosenTetap) {
                    text += "Status\t: Dosen Tetap\n";
                } else {
                    text += "Status\t: Dosen Honorer\n";
                }
                text += "NIK\t: " + dosen.getNIK() + "\n";
                text += "Departemen: " + dosen.getDepartemen() + "\n";
            }
            text += "Alamat\t: " + temp.getAlamat() + "\n";
            text += "Tempat Lahir : " + temp.getTTL() + "\n";
            text += "Tanggal Lahir : " + temp.getTTL() + "\n";
            text += "Telepon\t: " + temp.getTelepon() + "\n";
            JOptionPane.showMessageDialog(null, text, "Data User", 1);

        } else {
            JOptionPane.showMessageDialog(null, "Nama tidak ditemukan dalam sistem!", "Error", 1);
        }
    }
}

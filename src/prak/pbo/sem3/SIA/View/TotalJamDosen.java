package prak.pbo.sem3.SIA.View;

import javax.swing.JOptionPane;
import prak.pbo.sem3.SIA.model.*;
import java.util.ArrayList;
import prak.pbo.sem3.SIA.Controller.Controller;
import prak.pbo.sem3.SIA.model.Pegawai.*;

public class TotalJamDosen {

    public TotalJamDosen(ArrayList<User> user) {
        TotalAjar(user);
    }

    private String inputNik() {
        String Nik = JOptionPane.showInputDialog(null, "masukan Nik");
        return Nik;
    }

    private void TotalAjar(ArrayList<User> user) {
        Controller controler = new Controller();
        String nik = inputNik();
        Dosen dosen = controler.getDosenFromNik(user, nik);
        int total = controler.totalJamKerjaDosen(dosen);
        String text = "Total jam kerja Dosen = " + total;
        JOptionPane.showMessageDialog(null, text);
    }
}

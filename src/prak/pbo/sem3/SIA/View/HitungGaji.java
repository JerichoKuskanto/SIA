package prak.pbo.sem3.SIA.View;

import prak.pbo.sem3.SIA.model.*;
import prak.pbo.sem3.SIA.Controller.Controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HitungGaji {

    public HitungGaji(ArrayList<User> user) {
        TotalGaji(user);
    }

    private String inputNik() {
        String Nik = JOptionPane.showInputDialog(null, "masukan Nik");
        return Nik;
    }

    private void TotalGaji(ArrayList<User> user) {
        Controller controler = new Controller();
        String nik = inputNik();
        Staff staff = controler.getStaffFromNik(user, nik);
        double gaji = controler.hitungGaji(staff);
        String text = "Total gaji = " + gaji;
        JOptionPane.showMessageDialog(null, text);
    }
}

package prak.pbo.sem3.SIA.model.Pegawai;

import prak.pbo.sem3.SIA.model.Matkul.MatkulAjar;
import prak.pbo.sem3.SIA.model.Staff;
import java.util.ArrayList;

public class Dosen extends Staff {

    private String departemen;
    private ArrayList<MatkulAjar> matkulAjar = new ArrayList<>();

    public Dosen(String departemen, String NIK, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAjar> matkulAjar) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
        this.matkulAjar = matkulAjar;
    }

    public Dosen() {

    }

    @Override
    public String toString() {
        return "departemen: " + departemen + " matakulajar: " + matkulAjar + " pilihan: ";
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

}

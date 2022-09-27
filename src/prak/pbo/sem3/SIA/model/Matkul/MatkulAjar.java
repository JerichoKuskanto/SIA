package prak.pbo.sem3.SIA.model.Matkul;

import prak.pbo.sem3.SIA.model.present.PresensiStaff;
import java.util.ArrayList;

public class MatkulAjar {

    private Matakuliah matkulAmbil;
    private ArrayList<PresensiStaff> presensi = new ArrayList<>();

    public MatkulAjar(Matakuliah matkulAmbil, ArrayList<PresensiStaff> presensi) {
        this.matkulAmbil = matkulAmbil;
        this.presensi = presensi;
    }

    public MatkulAjar() {

    }

    public Matakuliah getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(Matakuliah matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        return "matakuliah yang diambil: " + matkulAmbil + " presensi: " + presensi;
    }

}

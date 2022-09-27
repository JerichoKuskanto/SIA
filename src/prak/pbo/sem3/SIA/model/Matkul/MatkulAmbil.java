package prak.pbo.sem3.SIA.model.Matkul;

import prak.pbo.sem3.SIA.model.present.Presensi;
import java.util.ArrayList;

public class MatkulAmbil {

    private Matakuliah matkulAmbil;
    private ArrayList presensi = new ArrayList<>();
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(Matakuliah matkulAmbil, int n1, int n2, int n3, ArrayList<Presensi> presensi) {
        this.matkulAmbil = matkulAmbil;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.presensi = presensi;
    }

    public MatkulAmbil() {

    }

    public Matakuliah getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(Matakuliah matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "matakuliah yang diambil: " + matkulAmbil + " presensi: " + presensi + " nilai 1: " + n1 + ", nilai 2: " + n2 + " nilai 3: " + n3;
    }

}

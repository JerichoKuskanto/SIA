package prak.pbo.sem3.SIA.model.Pegawai;

import java.util.ArrayList;
import prak.pbo.sem3.SIA.model.Matkul.MatkulAjar;

public class DosenHonorer extends Dosen {

    private ArrayList<MatkulAjar> matkulAjar;
    private int honorPerSKS;

    public DosenHonorer(int honorPerSKS, String departemen, String NIK, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAjar> matkulAjar) {
        super(departemen, NIK, nama, alamat, TTL, telepon, matkulAjar);
        this.honorPerSKS = honorPerSKS;
        this.matkulAjar = matkulAjar;
    }

    public DosenHonorer() {

    }

    @Override
    public String toString() {
        return "honorPerSKS: " + honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public ArrayList<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

}

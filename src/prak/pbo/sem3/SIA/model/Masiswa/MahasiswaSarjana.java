package prak.pbo.sem3.SIA.model.Masiswa;

import prak.pbo.sem3.SIA.model.Mahasiswa;
import java.util.ArrayList;
import prak.pbo.sem3.SIA.model.Matkul.MatkulAmbil;

public class MahasiswaSarjana extends Mahasiswa {

    private ArrayList<MatkulAmbil> matakuliahAmbil = new ArrayList<>();

    public MahasiswaSarjana(String NIM, String Jurusan, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAmbil> matakuliahAmbil) {
        super(NIM, Jurusan, nama, alamat, TTL, telepon);
        this.matakuliahAmbil = matakuliahAmbil;
    }

    public MahasiswaSarjana() {
    }

    public ArrayList<MatkulAmbil> getMatakuliahAmbil() {
        return matakuliahAmbil;
    }

    @Override
    public String toString() {
        return "MahasiswaSarjana" + "matakuliahAmbil=" + matakuliahAmbil;
    }

    public void setMatakuliahAmbil(ArrayList<MatkulAmbil> matakuliahAmbil) {
        this.matakuliahAmbil = matakuliahAmbil;
    }

}

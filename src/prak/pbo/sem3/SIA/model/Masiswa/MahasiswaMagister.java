package prak.pbo.sem3.SIA.model.Masiswa;

import prak.pbo.sem3.SIA.model.Matkul.MatkulAmbil;

import prak.pbo.sem3.SIA.model.Mahasiswa;
import java.util.ArrayList;

public class MahasiswaMagister extends Mahasiswa {

    private ArrayList<MatkulAmbil> matakuliahAmbil = new ArrayList<>();
    private String judul;

    @Override
    public String toString() {
        return "mata kuliah yang diambil=" + matakuliahAmbil + " judul: " + judul;
    }

    

    public MahasiswaMagister(String judul, String NIM, String Jurusan, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAmbil> matakuliahAmbil) {
        super(NIM, Jurusan, nama, alamat, TTL, telepon);
        this.judul = judul;
        this.matakuliahAmbil = matakuliahAmbil;
    }

    public MahasiswaMagister() {

    }

    public ArrayList<MatkulAmbil> getMatakuliahAmbil() {
        return matakuliahAmbil;
    }

    public void setMatakuliahAmbil(ArrayList<MatkulAmbil> matakuliahAmbil) {
        this.matakuliahAmbil = matakuliahAmbil;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

}

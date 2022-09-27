package prak.pbo.sem3.SIA.model.Masiswa;

import prak.pbo.sem3.SIA.model.Mahasiswa;

public class MahasiswaDoktor extends Mahasiswa {

    private String judul;
    private int sidang1;
    private int sidang2;
    private int sidang3;

    public MahasiswaDoktor(String judul, int sidang1, int sidang2, int sidang3, String NIM, String Jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, Jurusan, nama, alamat, TTL, telepon);
        this.judul = judul;
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }

    public MahasiswaDoktor() {

    }

    @Override
    public String toString() {
        return "judul: " + judul + " sidang 1: " + sidang1 + " sidang 2: " + sidang2 + " sidang 3: " + sidang3;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getSidang1() {
        return sidang1;
    }

    public void setSidang1(int sidang1) {
        this.sidang1 = sidang1;
    }

    public int getSidang2() {
        return sidang2;
    }

    public void setSidang2(int sidang2) {
        this.sidang2 = sidang2;
    }

    public int getSidang3() {
        return sidang3;
    }

    public void setSidang3(int sidang3) {
        this.sidang3 = sidang3;
    }

    

}

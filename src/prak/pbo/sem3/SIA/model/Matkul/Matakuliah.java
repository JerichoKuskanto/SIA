package prak.pbo.sem3.SIA.model.Matkul;

public class Matakuliah {

    private String kode;
    private int SKS;
    private String nama;

    public Matakuliah(String kode, int SKS, String nama) {
        this.kode = kode;
        this.SKS = SKS;
        this.nama = nama;
    }
    
    public Matakuliah() {

    }

    @Override
    public String toString() {
        return "kode: " + kode + " SKS: " + SKS + " nama: " + nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}

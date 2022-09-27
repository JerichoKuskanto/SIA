package prak.pbo.sem3.SIA.model;

public abstract class Mahasiswa extends User {

    private String NIM;
    private String Jurusan;

    public Mahasiswa(String NIM, String Jurusan, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.Jurusan = Jurusan;
    }

    public Mahasiswa() {

    }

    @Override
    public String toString() {
        return "Mahasiswa" + "NIM=" + NIM + ", Jurusan=" + Jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

}

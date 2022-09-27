package prak.pbo.sem3.SIA.model;

public abstract class User {

    private String nama;
    private String alamat;
    private String TTL;
    private String telepon;

    public User(String nama, String alamat, String TTL, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.TTL = TTL;
        this.telepon = telepon;
    }

    public User() {

    }

    public String toString() {
        return "nama: " + nama + " alamat: " + alamat + " TTL: " + TTL + " Telepon: " + telepon;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return this.TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getTelepon() {
        return this.telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}

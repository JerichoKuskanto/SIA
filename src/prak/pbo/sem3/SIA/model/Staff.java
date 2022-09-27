package prak.pbo.sem3.SIA.model;

public abstract class Staff extends User {

    private String NIK;

    public Staff(String NIK, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIK = NIK;
    }

    public Staff() {

    }

    @Override
    public String toString() {
        return "Staff" + "NIK=" + NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
}

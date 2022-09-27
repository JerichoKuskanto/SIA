package prak.pbo.sem3.SIA.model.present;

public class PresensiStaff extends Presensi implements StatusPresensi {

    private int jam;

    public PresensiStaff(int jam, String tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }

    public PresensiStaff() {

    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + " Jam: " + jam;
    }

}

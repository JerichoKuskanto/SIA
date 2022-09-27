package prak.pbo.sem3.SIA.model.present;

public class Presensi implements StatusPresensi {

    String tanggal;
    int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Presensi() {

    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isHadir(int status) {
        if (status == Hadir) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        String kehadiran;
        if (status == Hadir) {
            kehadiran = "Hadir";
        } else {
            kehadiran = "Alpha";
        }
        return "Tanggal: " + tanggal + "  Status: " + kehadiran;
    }
}

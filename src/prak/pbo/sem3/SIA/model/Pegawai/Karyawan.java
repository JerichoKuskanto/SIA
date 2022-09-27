package prak.pbo.sem3.SIA.model.Pegawai;

import java.util.ArrayList;
import prak.pbo.sem3.SIA.model.present.PresensiStaff;
import prak.pbo.sem3.SIA.model.Staff;

public class Karyawan extends Staff {

    private int salary;
    private ArrayList<PresensiStaff> presensi = new ArrayList<>();

    public Karyawan(String NIK, String nama, String alamat, String TTL, String telepon, int salary, ArrayList<PresensiStaff> presensi) {
        super(NIK, nama, alamat, TTL, telepon);
        this.presensi = presensi;
        this.salary = salary;

    }

    public Karyawan() {

    }

    @Override
    public String toString() {
        return "salary: " + salary + " presensi: " + presensi;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

}

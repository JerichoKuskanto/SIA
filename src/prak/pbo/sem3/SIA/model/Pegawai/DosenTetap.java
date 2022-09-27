package prak.pbo.sem3.SIA.model.Pegawai;

import java.util.ArrayList;
import prak.pbo.sem3.SIA.model.Matkul.MatkulAjar;

public class DosenTetap extends Dosen {

    private ArrayList<MatkulAjar> matkulAjar;
    private int salary;

    public DosenTetap(int salary, String departemen, String NIK, String nama, String alamat, String TTL, String telepon, ArrayList<MatkulAjar> matkulAjar) {
        super(departemen, NIK, nama, alamat, TTL, telepon, matkulAjar);
        this.salary = salary;
        this.matkulAjar = matkulAjar;
    }

    public DosenTetap() {

    }

    @Override
    public String toString() {
        return "salary: " + salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

}

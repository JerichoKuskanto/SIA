package prak.pbo.sem3.SIA.Controller;

import prak.pbo.sem3.SIA.model.*;
import prak.pbo.sem3.SIA.model.Masiswa.*;
import prak.pbo.sem3.SIA.model.Matkul.*;
import prak.pbo.sem3.SIA.model.Pegawai.*;
import java.util.ArrayList;

public class Controller {

    public Controller() {
    }

    public User getUserFromNama(ArrayList<User> listUser, String nama) {
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getNama().equals(nama)) {
                return listUser.get(i);
            }
        }
        return null;
    }

    public boolean checkNama(ArrayList<User> listUser, String nama) {
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getNama().equals(nama)) {
                return true;
            }
        }
        return false;
    }

    public Mahasiswa getMahasiswaFromNim(ArrayList<User> listUser, String nim) {
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i) instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) listUser.get(i);
                if (mhs.getNIM().equals(nim)) {
                    return mhs;
                }
            }
        }
        return null;
    }

    public int hitungrataMHS(Mahasiswa mhs, String kode) {
        if (mhs instanceof MahasiswaSarjana) {
            MahasiswaSarjana mhsSarjana = (MahasiswaSarjana) mhs;
            for (int j = 0; j < mhsSarjana.getMatakuliahAmbil().size(); j++) {
                if (mhsSarjana.getMatakuliahAmbil().get(j).getMatkulAmbil().getKode().equals(kode)) {
                    return (mhsSarjana.getMatakuliahAmbil().get(j).getN1() + mhsSarjana.getMatakuliahAmbil().get(j).getN2()
                            + mhsSarjana.getMatakuliahAmbil().get(j).getN3()) / 3;
                }
            }
        } else if (mhs instanceof MahasiswaMagister) {
            MahasiswaMagister mhsMagister = (MahasiswaMagister) mhs;
            for (int j = 0; j < mhsMagister.getMatakuliahAmbil().size(); j++) {
                if (mhsMagister.getMatakuliahAmbil().get(j).getMatkulAmbil().getKode().equals(kode)) {
                    return (mhsMagister.getMatakuliahAmbil().get(j).getN1() + mhsMagister.getMatakuliahAmbil().get(j).getN2()
                            + mhsMagister.getMatakuliahAmbil().get(j).getN3()) / 3;
                }
            }
        }

        return 0;
    }

    public boolean cekMatkulFromKode(ArrayList<Matakuliah> listMatkul, String kode) {
        for (int i = 0; i < listMatkul.size(); i++) {
            if (listMatkul.get(i).getKode().equals(kode)) {
                return true;
            }
        }
        return false;
    }

    public int hitungRataDoktor(MahasiswaDoktor listSidang) {

        return (listSidang.getSidang1() + listSidang.getSidang2() + listSidang.getSidang3()) / 3;

    }

    public boolean cekIkutMatkul(Mahasiswa mhs, String kodeMK) {
        if (mhs instanceof MahasiswaSarjana) {
            MahasiswaSarjana mhsSarjana = (MahasiswaSarjana) mhs;
            for (int j = 0; j < mhsSarjana.getMatakuliahAmbil().size(); j++) {
                if (mhsSarjana.getMatakuliahAmbil().get(j).getMatkulAmbil().getKode().equals(kodeMK)) {
                    return true;
                }
            }
        } else if (mhs instanceof MahasiswaMagister) {
            MahasiswaMagister mhsMagister = (MahasiswaMagister) mhs;
            for (int j = 0; j < mhsMagister.getMatakuliahAmbil().size(); j++) {
                if (mhsMagister.getMatakuliahAmbil().get(j).getMatkulAmbil().getKode().equals(kodeMK)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String cekJumlahMatkul(Mahasiswa mhs, MatkulAmbil listmatkul) {
        String text = "Matakuliah yang diambil : \n";
        if (mhs instanceof MahasiswaSarjana) {
            MahasiswaSarjana mhsSarjana = (MahasiswaSarjana) mhs;
            for (int j = 0; j < mhsSarjana.getMatakuliahAmbil().size(); j++) {
                int absensi = 0;
                text += mhsSarjana.getMatakuliahAmbil().get(j).getMatkulAmbil().getNama() + " ";
                for (int i = 0; i < mhsSarjana.getMatakuliahAmbil().get(j).getPresensi().size(); i++) {
                    if (mhsSarjana.getMatakuliahAmbil().get(j).getPresensi().get(i).getStatus() == 1) {
                        absensi++;
                    }
                }
                text += "dengan absen: " + absensi + "\n";
            }
        } else {
            MahasiswaMagister mhsMagister = (MahasiswaMagister) mhs;
            for (int j = 0; j < mhsMagister.getMatakuliahAmbil().size(); j++) {
                int absensi = 0;
                text += mhsMagister.getMatakuliahAmbil().get(j).getMatkulAmbil().getNama() + " ";
                for (int i = 0; i < mhsMagister.getMatakuliahAmbil().get(j).getPresensi().size(); i++) {
                    if (mhsMagister.getMatakuliahAmbil().get(j).getPresensi().get(i).getStatus() == 1) {
                        absensi++;
                    }
                }
                text += "dengan absen: " + absensi + "\n";
            }
        }
        return text;
    }

    public Dosen getDosenFromNik(ArrayList<User> user, String nik) {
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i) instanceof Dosen) {
                Dosen dosen = (Dosen) user.get(i);
                if (dosen.getNIK().equals(nik)) {
                    return dosen;
                }
            }
        }
        return null;
    }

    public Staff getStaffFromNik(ArrayList<User> user, String nik) {
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i) instanceof Staff) {
                Staff staff = (Staff) user.get(i);
                if (staff.getNIK().equals(nik)) {
                    return staff;
                }
            }
        }
        return null;
    }

    public int totalJamKerjaDosen(Dosen dosen) {
        int total = 0;
        if (dosen instanceof DosenTetap) {
            DosenTetap dosenTetap = (DosenTetap) dosen;
            for (int i = 0; i < dosenTetap.getMatkulAjar().size(); i++) {
                int absensi = 0;
                for (int j = 0; j < dosenTetap.getMatkulAjar().get(i).getPresensi().size(); j++) {
                    if (dosenTetap.getMatkulAjar().get(i).getPresensi().get(j).getStatus() == 1) {
                        absensi = dosenTetap.getMatkulAjar().get(i).getPresensi().get(j).getJam();
                    }
                }
                total += absensi;
            }
        } else {
            DosenHonorer dosenHonor = (DosenHonorer) dosen;
            for (int i = 0; i < dosenHonor.getMatkulAjar().size(); i++) {
                int absensi = 0;
                for (int j = 0; j < dosenHonor.getMatkulAjar().get(i).getPresensi().size(); j++) {
                    if (dosenHonor.getMatkulAjar().get(i).getPresensi().get(j).getStatus() == 1) {
                        absensi = dosenHonor.getMatkulAjar().get(i).getPresensi().get(j).getJam();
                    }
                }
                total += absensi;
            }
        }
        return total;
    }

    public int totalJamKerjaKaryawan(Karyawan karyawan) {
        int total = 0;
        for (int i = 0; i < karyawan.getPresensi().size(); i++) {
            int absensi = 0;
            if (karyawan.getPresensi().get(i).getStatus() == 1) {
                absensi = karyawan.getPresensi().get(i).getJam();
            }
            total += absensi;
        }
        return total;
    }

    public double hitungGaji(Staff staff) {
        double total = 0;
        if (staff instanceof Karyawan) {
            Karyawan karyawan = (Karyawan) staff;
            int jamKerja = totalJamKerjaKaryawan(karyawan);
            double gaji = (jamKerja / 22) * karyawan.getSalary();
            total = gaji;
        } else if (staff instanceof Dosen) {
            Dosen dosen = (Dosen) staff;
            int jamKerja = totalJamKerjaDosen(dosen);
            if (dosen instanceof DosenTetap) {
                DosenTetap dosenTetap = (DosenTetap) dosen;
                int gaji = (jamKerja * 25000) + dosenTetap.getSalary();
                total = gaji;
            } else if (dosen instanceof DosenHonorer) {
                DosenHonorer dosenHonor = (DosenHonorer) dosen;
                int temp =0;
                for (int i = 0; i < dosenHonor.getMatkulAjar().size(); i++) {
                    temp +=  dosenHonor.getMatkulAjar().get(i).getMatkulAmbil().getSKS();
                }
                int gaji = (jamKerja * (dosenHonor.getHonorPerSKS()*temp));
                total = gaji;
            }
        }
        return total;
    }
}

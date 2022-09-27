package prak.pbo.sem3.SIA.View;

import javax.swing.JOptionPane;
import prak.pbo.sem3.SIA.model.*;
import java.util.ArrayList;
import prak.pbo.sem3.SIA.model.Masiswa.*;
import prak.pbo.sem3.SIA.model.Matkul.*;
import prak.pbo.sem3.SIA.model.Pegawai.*;
import prak.pbo.sem3.SIA.model.present.*;

public class Main_Menu {

    public Main_Menu() {
        showMenu();
    }

    private void showMenu() {
        ArrayList<Matakuliah> listMatkul = new ArrayList<>();
        ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<>();
        ArrayList<MatkulAmbil> listMatkulAmbil2 = new ArrayList<>();
        ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<>();
        ArrayList<Presensi> listPresensi = new ArrayList<>();
        ArrayList<Presensi> listPresensi2 = new ArrayList<>();
        ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();
        ArrayList<User> user = new ArrayList<>();

        //Insert presensi (untuk siswa)
        listPresensi.add(new Presensi("2022-09-03", 1));
        listPresensi.add(new Presensi("2022-09-10", 0));
        listPresensi.add(new Presensi("2022-09-17", 1));
        listPresensi2.add(new Presensi("2022-09-17", 0));
        listPresensi2.add(new Presensi("2022-09-17", 0));

        //Insert presensi (untuk staff)
        listPresensiStaff.add(new PresensiStaff(2, "2022-09-10", 0));
        listPresensiStaff.add(new PresensiStaff(4, "2022-09-10", 1));

        //Insert data mata kuliah
        listMatkul.add(new Matakuliah("IF-001", 4, "Algoritma"));
        listMatkul.add(new Matakuliah("IF-002", 1, "Prak. Algoritma"));
        listMatkul.add(new Matakuliah("IF-003", 2, "Web Design"));
        listMatkul.add(new MatkulPilihan(10, "IF-004", 4, "Game Dev"));
        listMatkul.add(new MatkulPilihan(12, "IF-005", 3, "Gsme Design"));

        //Insert matkul ambil
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(0), 68, 95, 81, listPresensi));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(1), 78, 66, 91, listPresensi));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(2), 58, 60, 71, listPresensi));
        listMatkulAmbil2.add(new MatkulAmbil(listMatkul.get(0), 30, 40, 50, listPresensi2));
        listMatkulAmbil2.add(new MatkulAmbil(listMatkul.get(2), 30, 60, 50, listPresensi));

        listMatkulAjar.add(new MatkulAjar(listMatkul.get(0), listPresensiStaff));
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(2), listPresensiStaff));
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(4), listPresensiStaff));
        //Insert data user
        MahasiswaSarjana user1 = new MahasiswaSarjana("1121001", "IF", "Albedo", "Jl.123", "Bandung 01-01-2003", "08123456", listMatkulAmbil2);
        MahasiswaMagister user2 = new MahasiswaMagister("Teorema ABC", "1118001", "IF", "Fransiska", "Jl.456", "Jakarta 21-06-1999", "08451422", listMatkulAmbil);
        MahasiswaDoktor user3 = new MahasiswaDoktor("Gundam di 2022", 70, 50, 90, "1116001", "IF", "Albert", "Jl.12A", "Bandung 31-12-1992", "081567112");
        Karyawan user4 = new Karyawan("110001", "Kusumawijaya", "Jl.123", "Bandung 18-08-1995", "08123456", 3500000, listPresensiStaff);
        DosenTetap user5 = new DosenTetap(6000000, "Informatika", "110002", "Henri Kovalainen", "Jl.123C", "Bandung 09-01-1978", "0811286441", listMatkulAjar);
        DosenHonorer user6 = new DosenHonorer(500000, "Informatika", "110003", "Lina Agustina", "Jl.123", "Bandung 16-09-1990", "081000000", listMatkulAjar);

        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        user.add(user5);
        user.add(user6);

        boolean exit = true;
        while (exit) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: \n1. print user data"
                    + "\n2. print nilai akhir \n3. print rata-rata nilai akhir \n4. print banyak mahasiswa yang tidak lulus"
                    + "\n5. print daftar matkul \n6. print total waktu dosen mengajar \n7. print gaji pekerja"));
            switch (menu) {
                case 1:
                    new PrintUserData(user);
                    break;
                case 2:
                    new PrintNilaiAkhir(user, listMatkul, listMatkulAmbil);
                    break;
                case 3:
                    new PrintNRSeluruhMahasiswa(user, listMatkul, listMatkulAmbil);
                    break;
                case 4:
                    new TidakLulus(user, listMatkul, listMatkulAmbil);
                    break;
                case 5:
                    new MatkulAmbilAbsensi(user, listMatkul, listMatkulAmbil);
                    break;
                case 6:
                    new TotalJamDosen(user);
                    break;
                case 7:
                    new HitungGaji(user);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "GoodBye");
                    exit = false;
                    break;
            }
        }
    }
}

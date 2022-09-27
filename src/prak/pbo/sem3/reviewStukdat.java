package prak.pbo.sem3;

import java.util.Scanner;

public class reviewStukdat {

    static class Pasien {

        String nama;
        JenisKamar[] RawatInap = new JenisKamar[10];
        JenisPerawatan[] Perawatan = new JenisPerawatan[5];
        boolean BPJS;

        public Pasien(String nama, boolean BPJS) {
            this.nama = nama;
            this.BPJS = BPJS;
        }

    }

    static class JenisKamar {

        String Kelas;
        int Biaya;

        public JenisKamar(String Kelas, int Biaya) {
            this.Kelas = Kelas;
            this.Biaya = Biaya;
        }
    }

    static class JenisPerawatan {

        String nama;
        int Biaya;

        public JenisPerawatan(String nama, int Biaya) {
            this.nama = nama;
            this.Biaya = Biaya;
        }
    }

    static Pasien[] patients = new Pasien[150];

    public static void TotalBiayaPasien(String nama) {
        int total = 0;
        int totalKamar = 0;
        int totalPerawatan = 0;
        int[] kamar = new int[4];
        boolean found = false;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].nama.equals(nama)) {
                System.out.println(nama);
                if (patients[i].BPJS) {
                    System.out.println("Status BPJS: memiliki \n");
                    for (int j = 0; j < 10; j++) {
                        if (patients[i].RawatInap[j].Kelas.equals("I")) {
                            kamar[0]++;
                        } else if (patients[i].RawatInap[j].Kelas.equals("II")) {
                            kamar[1]++;
                        } else if (patients[i].RawatInap[j].Kelas.equals("II")) {
                            kamar[2]++;
                        } else {
                            kamar[3]++;
                        }
                        totalKamar += patients[i].RawatInap[j].Biaya;
                    }
                    System.out.println("total harga kamar: " + totalKamar);
                    System.out.println("Kamar yang diambil: \n"
                            + "I: " + kamar[0] + " hari"
                            + "\nII: " + kamar[1] + " hari"
                            + "\nIII: " + kamar[2] + " hari"
                            + "\nVIP: " + kamar[3] + " hari");
                    int temp = 0;
                    System.out.println("Perawatan yang diambil:");
                    while (patients[i].Perawatan[temp] != null) {
                        System.out.println(patients[i].Perawatan[temp].nama + "\n");
                        totalPerawatan += patients[i].Perawatan[temp].Biaya;
                        temp++;
                    }
                    System.out.println("Total biaya Perawatan: " + totalPerawatan);
                    System.out.println("Total yang harus dibayar pasien = 0");
                } else {
                    System.out.println("Status BPJS: tidak memiliki \n");
                    for (int j = 0; j < 10; j++) {
                        if (patients[i].RawatInap[j].Kelas.equals("I")) {
                            kamar[0]++;
                        } else if (patients[i].RawatInap[j].Kelas.equals("II")) {
                            kamar[1]++;
                        } else if (patients[i].RawatInap[j].Kelas.equals("II")) {
                            kamar[2]++;
                        } else {
                            kamar[3]++;
                        }
                        totalKamar += patients[i].RawatInap[j].Biaya;
                    }
                    System.out.println("total harga kamar: " + totalKamar);
                    System.out.println("Kamar yang diambil: \n"
                            + "I: " + kamar[0] + " hari"
                            + "\nII: " + kamar[1] + " hari"
                            + "\nIII: " + kamar[2] + " hari"
                            + "\nVIP: " + kamar[3] + " hari");
                    int temp = 0;
                    System.out.println("Perawatan yang diambil:");
                    while (patients[i].Perawatan[temp] != null) {
                        System.out.println(patients[i].Perawatan[temp].nama + "\n");
                        totalPerawatan += patients[i].Perawatan[temp].Biaya;
                        temp++;
                    }
                    System.out.println("Total biaya Perawatan: " + totalPerawatan);
                    total = totalKamar + totalPerawatan;
                    System.out.println("Total yang harus dibayar pasien = " + total);
                }
                found = true;
                break;
            }
            if (found == false) {
                System.out.println("nama pasien tidak ditemukan");
            }
        }
        System.out.println("\n");
    }

    public static int InputPasien(int urut) {
        Scanner sc = new Scanner(System.in);
        for (int k = urut; k < 150; k++) {
            System.out.println("masukan nama pasien");
            String nama = sc.nextLine();
            System.out.println("apakah pasien memiliki BPJS? (\"Y\"/\"N\")");
            String BPJS = sc.next();
            Boolean statusBPJS = false;
            if (BPJS.equalsIgnoreCase("y")) {
                statusBPJS = true;
            }
            Pasien inputPasien = new Pasien(nama, statusBPJS);
            patients[k] = inputPasien;
            for (int i = 0; i < 10; i++) {
                System.out.println("masukan jenis kamar pasien \"I\", \"II\", \"III\",\"VIP\" di hari ke-" + (i + 1));
                String jenisKamar = sc.next();
                int biayaKamar = 0;
                switch (jenisKamar) {
                    case "I":
                        biayaKamar = 100000;
                        break;
                    case "II":
                        biayaKamar = 150000;
                        break;
                    case "III":
                        biayaKamar = 200000;
                        break;
                    default:
                        biayaKamar = 450000;
                }
                JenisKamar inputKamar = new JenisKamar(jenisKamar, biayaKamar);
                inputPasien.RawatInap[i] = inputKamar;
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Jenis Perawatan yang diambil");
                String perawatan = sc.next();
                int biayaPerawatan = 0;
                switch (perawatan) {
                    case "Operasi":
                        biayaPerawatan = 400000;
                        break;
                    case "X-ray":
                        biayaPerawatan = 150000;
                        break;
                    case "USG":
                        biayaPerawatan = 200000;
                        break;
                    default:
                        biayaPerawatan = 300000;
                }
                JenisPerawatan inputPerawatan = new JenisPerawatan(perawatan, biayaPerawatan);
                inputPasien.Perawatan[i] = inputPerawatan;
                System.out.println("apakah ada perawatan lagi? (\"Y\"/\"N\")");
                String konfirm = sc.next();
                if (konfirm.equalsIgnoreCase("n")) {
                    break;
                }
            }
            System.out.println("apakah ingin menambah pasien lagi? (\"Y\"/\"N\")");
            String exit = sc.next();
            sc.nextLine();
            urut++;
            if (exit.equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("\n");
        return urut;
    }

    public static void Pendapatan() {
        int total = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].BPJS == false) {
                for (int j = 0; j < 10; j++) {
                    total += patients[i].RawatInap[j].Biaya;
                }
                int temp = 0;
                while (patients[i].Perawatan[temp] != null && temp < 5) {
                    total += patients[i].Perawatan[temp].Biaya;
                    temp++;
                }
            }
        }
        System.out.println("total pendapatan rumah sakit: " + total + "\n");
    }

    public static void jumlahPerawatan(String perawatan) {
        int jumlah = 0;
        boolean found = false;
        System.out.println("pasien yang menggunakan perawatan: " + perawatan + "\n");
        for (int i = 0; i < patients.length; i++) {
            int temp = 0;
            while (patients[i].Perawatan[temp] != null) {
                if (patients[i].Perawatan[temp].nama.equals(perawatan)) {
                    System.out.println((i + 1) + ". " + patients[i].nama);
                    found = true;
                    jumlah++;
                }
                temp++;
                if (temp == 4) {
                    break;
                }
            }
        }
        if (found == false) {
            System.out.println("tidak ada yang menggunakan perawatan tersebut");
        }
        System.out.println("jumlah pasien yang menggunakan perawatan tersebut: " + jumlah + "\n");
    }

    public static void main(String[] args) {
        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Pasien("", true);
            for (int j = 0; j < 10; j++) {
                patients[i].RawatInap[j] = new JenisKamar("", 0);
            }
            for (int j = 0; j < 5; j++) {
                patients[i].Perawatan[j] = new JenisPerawatan("", 0);
            }
        }
        Scanner sc = new Scanner(System.in);
        int urut = 0;
        boolean exit = true;
        while (exit) {
            System.out.println("Menu \n"
                    + "1. hitung total biaya seorang pasien\n"
                    + "2. hitung total pendapatan rumah sakit\n"
                    + "3. hitung jumlah pasien yang menggunakan suatu perawatan\n"
                    + "4. input pasien baru\n"
                    + "5. exit");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("masukan nama pasien");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    TotalBiayaPasien(nama);
                    break;
                case 2:
                    Pendapatan();
                    break;
                case 3:
                    System.out.println("masukan nama perawatan");
                    String perawatan = sc.next();
                    jumlahPerawatan(perawatan);
                    break;
                case 4:
                    int temp = InputPasien(urut);
                    urut = temp;
                    System.out.println(urut);
                    break;
                default:
                    exit = false;

            }
        }
    }
}


import java.util.Scanner;
public class TugasNo3_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        input.nextLine();
        inputData(input, n, namaMataKuliah, sks, semester, hariKuliah);

        while (true) {
            System.out.println("\nProgram Jadwal Kuliah");
            System.out.println("1. Tampilkan Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 5) {
                System.out.println("Program Selesai.");
                break;
            } else if (pilihan == 1) {
                tampilkanJadwal(n, namaMataKuliah, sks, semester, hariKuliah);
            } else if (pilihan == 2) {
                System.out.print("\nMasukkan hari kuliah : ");
                String namaHari = input.nextLine();
                tampilkanJadwalBerdasarkanHari(n, namaMataKuliah, sks, semester, hariKuliah, namaHari);
            } else if (pilihan == 3) {
                System.out.print("\nMasukkan semester : ");
                int semesterKe = input.nextInt();
                tampilkanJadwalBerdasarkanSemester(n, namaMataKuliah, sks, semester, hariKuliah, semesterKe);
            } else if (pilihan == 4) {
                System.out.print("\nMasukkan nama mata kuliah : ");
                String namaMatkul = input.nextLine();
                cariMataKuliah(n, namaMataKuliah, sks, semester, hariKuliah, namaMatkul);
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void inputData(Scanner input, int n, String[] nama, int[] sks, int[] semester, String[] hari) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            nama[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari Kuliah: ");
            hari[i] = input.nextLine();
        }
    }

    static void tampilkanJadwal(int n, String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\nSeluruh Jadwal");
        for (int i = 0; i < n; i++) {
            System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    static void tampilkanJadwalBerdasarkanHari(int n, String[] nama, int[] sks, int[] semester, String[] hari, String namaHari) {
        System.out.println("\nJadwal Kuliah Hari " + namaHari.toUpperCase() + " :");
        for (int i = 0; i < n; i++) {
            if (hari[i].equalsIgnoreCase(namaHari)) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
            }
        }
    }

    static void tampilkanJadwalBerdasarkanSemester(int n, String[] nama, int[] sks, int[] semester, String[] hari, int semesterKe) {
        System.out.println("\nJadwal Kuliah Sem " + semesterKe + " :");
        for (int i = 0; i < n; i++) {
            if (semester[i] == semesterKe) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Hari: " + hari[i]);
            }
        }
    }

    static void cariMataKuliah(int n, String[] nama, int[] sks, int[] semester, String[] hari, String namaMatkul) {
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (nama[i].equalsIgnoreCase(namaMatkul)) {
                System.out.println("Mata Kuliah: " + nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + namaMatkul + " tidak ditemukan.");
        }
    }
}

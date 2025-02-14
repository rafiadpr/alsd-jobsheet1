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

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }

        while (true) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 5) {
                System.out.println("Terima kasih!");
                break;
            }

            if (pilihan == 1) {
                System.out.println("\n=== SELURUH JADWAL KULIAH ===");
                for (int i = 0; i < n; i++) {
                    System.out.println(namaMataKuliah[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                }
            } else if (pilihan == 2) {
                System.out.print("\nMasukkan hari kuliah yang ingin ditampilkan: ");
                String hariCari = input.nextLine();
                System.out.println("\n=== JADWAL KULIAH HARI " + hariCari.toUpperCase() + " ===");
                for (int i = 0; i < n; i++) {
                    if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                        System.out.println(namaMataKuliah[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                    }
                }
            } else if (pilihan == 3) {
                System.out.print("\nMasukkan semester yang ingin ditampilkan: ");
                int semesterCari = input.nextInt();
                System.out.println("\n=== JADWAL KULIAH SEMESTER " + semesterCari + " ===");
                for (int i = 0; i < n; i++) {
                    if (semester[i] == semesterCari) {
                        System.out.println(namaMataKuliah[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                    }
                }
            } else if (pilihan == 4) {
                System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
                String namaCari = input.nextLine();
                boolean ditemukan = false;
                for (int i = 0; i < n; i++) {
                    if (namaMataKuliah[i].equalsIgnoreCase(namaCari)) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Mata kuliah " + namaCari + " tidak ditemukan.");
                }
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}

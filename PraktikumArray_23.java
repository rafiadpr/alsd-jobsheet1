
import java.util.Scanner;

public class PraktikumArray_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] matkul = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        int[] sks = {2, 3, 2, 3, 2, 3, 3, 2};
        double[] nilaiAngka = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] bobotNilai = new double[matkul.length];

        double totalBobotNilai = 0;
        int totalSKS = 0;

        System.out.println("==================================");
        System.out.println("  Program Menghitung IP Semester  ");
        System.out.println("==================================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            // Konversi nilai angka ke nilai huruf
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }

            totalBobotNilai += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobotNilai / totalSKS;

        System.out.println("==================================");
        System.out.println("        Hasil Konversi Nilai      ");
        System.out.println("==================================");
        System.out.println("MK                                    | Nilai Angka | Nilai Huruf | Bobot Nilai");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < matkul.length; i++) {
            System.out.println(matkul[i] + " | " + nilaiAngka[i] + " | " + nilaiHuruf[i] + " | " + bobotNilai[i]);
        }

        System.out.println("==================================");
        System.out.println("IP : " + ipSemester);
        System.out.println("==================================");
    }
}

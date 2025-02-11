
import java.util.Scanner;

public class PraktikumPemilihan_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nilaiHuruf, keterangan;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        do {
            System.out.print("Masukkan nilai tugas: ");
            nilaiTugas = input.nextInt();
        } while (nilaiTugas < 0 || nilaiTugas > 100);

        do {
            System.out.print("Masukkan nilai kuis: ");
            nilaiKuis = input.nextInt();
        } while (nilaiKuis < 0 || nilaiKuis > 100);

        do {
            System.out.print("Masukkan nilai UTS: ");
            nilaiUTS = input.nextInt();
        } while (nilaiUTS < 0 || nilaiUTS > 100);

        do {
            System.out.print("Masukkan nilai UAS: ");
            nilaiUAS = input.nextInt();
        } while (nilaiUAS < 0 || nilaiUAS > 100);
        System.out.println("==============================");

        nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.println("==============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println("Keterangan: " + keterangan);
    }
}

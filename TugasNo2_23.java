
import java.util.Scanner;

public class TugasNo2_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihMenu;
        double sisi;

        while (true) {
            System.out.println("\n=== KALKULATOR KUBUS ===");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihMenu = input.nextInt();

            if (pilihMenu == 4) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            }

            System.out.print("Masukkan panjang sisi kubus: ");
            sisi = input.nextDouble();

            switch (pilihMenu) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }
        }
    }

    public static double hitungVolume(double s) {
        return s * s * s;
    }

    public static double hitungLuasPermukaan(double s) {
        return 6 * s * s;
    }

    public static double hitungKeliling(double s) {
        return 12 * s;
    }
}

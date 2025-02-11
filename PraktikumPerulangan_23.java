import java.util.Scanner;

public class PraktikumPerulangan_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nim;
        int n;

        System.out.print("Masukkan NIM: ");
        nim = input.nextLong();

        n = (int) (nim % 100);

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewati angka 6 dan 10
            }

            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

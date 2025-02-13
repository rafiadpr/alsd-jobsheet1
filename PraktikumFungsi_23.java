public class PraktikumFungsi_23 {

    public static void main(String[] args) {
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        String[] cabangToko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

        tampilkanPendapatan(stockBunga, hargaBunga, cabangToko);

        tampilkanStockRoyalGarden4(stockBunga);
    }

    public static void tampilkanPendapatan(int[][] stock, int[] harga, String[] cabang) {
        System.out.println("Pendapatan setiap cabang jika semua bunga terjual:");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println(cabang[i] + " : Rp " + totalPendapatan);
        }
        System.out.println();
    }

    public static void tampilkanStockRoyalGarden4(int[][] stock) {
        int[] bungaMati = {-1, -2, 0, -5};

        System.out.println("Stock Bunga di RoyalGarden 4 sebelum pengurangan:");
        System.out.println("Aglonema: " + stock[3][0]);
        System.out.println("Keladi: " + stock[3][1]);
        System.out.println("Alocasia: " + stock[3][2]);
        System.out.println("Mawar: " + stock[3][3]);

        for (int i = 0; i < stock[3].length; i++) {
            stock[3][i] += bungaMati[i];
        }

        System.out.println("\nStock Bunga di RoyalGarden 4 setelah pengurangan bunga mati:");
        System.out.println("Aglonema: " + stock[3][0]);
        System.out.println("Keladi: " + stock[3][1]);
        System.out.println("Alocasia: " + stock[3][2]);
        System.out.println("Mawar: " + stock[3][3]);
    }
}

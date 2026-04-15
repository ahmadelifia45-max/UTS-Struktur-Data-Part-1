package uts_part1;
public class insertionsort {
    public static void main(String[] args) {

        String[] Tim = {"tim A", "tim B", "tim C", "tim D", "tim E", "tim F", "tim G", "tim H", "tim I", "tim J"};
        int[] poin = {28, 51, 22, 62, 38, 48, 29, 56, 43, 35};
        int n = poin.length;

        System.out.print("Sebelum diurutkan\t: ");
        for (int i = 0; i < n; i++) {
            System.out.print(poin[i] + (i == n - 1 ? "\n" : ", "));
        }

        System.out.println("=================================================================");

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int keyPoin = poin[i];
            String keyTim = Tim[i];
            int j = i - 1;

            // geser elemen yang lebih besar ke kanan
            while (j >= 0 && poin[j] > keyPoin) {
                poin[j + 1] = poin[j];
                Tim[j + 1] = Tim[j];
                j--;
            }

            // masukkan ke posisi yang benar
            poin[j + 1] = keyPoin;
            Tim[j + 1] = keyTim;

            // tampilkan tiap iterasi
            System.out.print("Iterasi ke " + i + "\t\t: ");
            for (int k = 0; k < n; k++) {
                System.out.print(poin[k] + (k == n - 1 ? "\n" : ", "));
            }
        }

        System.out.println("=================================================================");

        System.out.println("\nHasil Akhir Setelah menggunakan teknik Insertion Sort :");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + Tim[i] + " \t= " + poin[i] + " poin");
        }
    }
}
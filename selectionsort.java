package uts_part1;
public class selectionsort {
    public static void main(String[] args) {

        String[] Tim = {"tim A", "tim B", "tim C", "tim D", "tim E", "tim F", "tim G", "tim H", "tim I", "tim J"};
        int[] poin = {28, 51, 22, 62, 38, 48, 29, 56, 43, 35};
        int n = poin.length;

        System.out.print("Sebelum diurutkan\t: ");
        for (int i = 0; i < n; i++) {
            System.out.print(poin[i] + (i == n - 1 ? "\n" : ", "));
        }

        System.out.println("=================================================================");

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            // cari indeks nilai terkecil
            for (int j = i + 1; j < n; j++) {
                if (poin[j] < poin[min]) {
                    min = j;
                }
            }

            // tukar poin
            int tempPoin = poin[i];
            poin[i] = poin[min];
            poin[min] = tempPoin;

            // tukar tim (biar tetap sinkron)
            String tempTim = Tim[i];
            Tim[i] = Tim[min];
            Tim[min] = tempTim;

            // tampilkan tiap iterasi
            System.out.print("Iterasi ke " + (i + 1) + "\t\t: ");
            for (int k = 0; k < n; k++) {
                System.out.print(poin[k] + (k == n - 1 ? "\n" : ", "));
            }
        }

        System.out.println("=================================================================");

        System.out.println("\nHasil Akhir Setelah menggunakan teknik Selection Sort :");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + Tim[i] + " \t= " + poin[i] + " poin");
        }
    }
}
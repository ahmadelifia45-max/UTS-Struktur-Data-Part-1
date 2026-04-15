package uts_part1;
public class bubblesort {
    public static void main(String[] args) {

        String[] Tim = {"tim A", "tim B", "tim C", "tim D", "tim E", "tim F", "tim G", "tim H", "tim I", "tim J"};
        int[] poin = {28, 51, 22, 62, 38, 48, 29, 56, 43, 35};
        int n = poin.length;

        System.out.print("Sebelum diurutkan\t: ");
        for (int i = 0; i < n; i++) {
            System.out.print(poin[i] + (i == n - 1 ? "\n" : ", "));
        }

        System.out.println("=================================================================");

        for (int i = 0; i < n - 1; i++) {
            System.out.print("Iterasi ke " + (i + 1) + "\t\t: ");

            for (int j = 0; j < n - i - 1; j++) {
                if (poin[j] > poin[j + 1]) {
                    
                    int tempPoin = poin[j];
                    poin[j] = poin[j + 1];
                    poin[j + 1] = tempPoin;

                    String tempTim = Tim[j];
                    Tim[j] = Tim[j + 1];
                    Tim[j + 1] = tempTim;
                }
            }
        
            for (int k = 0; k < n; k++) {
                System.out.print(poin[k] + (k == n - 1 ? "\n" : ", "));
            }
        }
        
        System.out.println("=================================================================");

        System.out.println("\nHasil Akhir Setelah menggunakan teknik Bubble Sort :");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + Tim[i] + " \t= " + poin[i] + " poin");
        }
    }
}
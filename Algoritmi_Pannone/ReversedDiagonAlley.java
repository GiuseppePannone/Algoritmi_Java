import java.util.Scanner;

public class ReversedDiagonAlley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci le righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci le colonne: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        int i = 0;

        do {
            int j = 0;
            do {
                int x = m - 1;
                if(i + j == x) {
                    matrix[i][j] = 1;
                } j++;
            } while(j < m);
            i++;
        } while (i < n);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(" " + matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

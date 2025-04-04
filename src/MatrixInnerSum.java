import java.util.Arrays;
import java.util.Scanner;

public class MatrixInnerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci colonne: ");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        int i = 0;

        do {
            int j = 0;
            do {
                System.out.println("Inserisci un numero: ");
                matrix[i][j] = scanner.nextInt();
                j++;
            } while (j < m);
            i++;
        } while (i < n);
        System.out.println("La tua matrice è: " + Arrays.deepToString(matrix));
        int somma = 0;
        i = 0;
        do {
            int j = 0;
            do {
                somma = somma + matrix[i][j];
                j++;
            } while (j < m);
            i++;
        } while (i < n);
        System.out.println("La somma degli elementi interni della tua matrice è: " + somma);
    }
}

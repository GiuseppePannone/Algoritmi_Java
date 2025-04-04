import java.util.Arrays;
import java.util.Scanner;

public class MatrixOuterSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci colonne: ");
        int m = scanner.nextInt();

        int[][] matrixA = new int[n][m];

        int i = 0;

        do {
            int j = 0;
            do {
                System.out.println("Inserisci un numero: ");
                matrixA[i][j] = scanner.nextInt();
                j++;
            } while (j < m);
            i++;
        } while (i < n);
        System.out.println("La tua prima matrice è: " + Arrays.deepToString(matrixA));

        System.out.println("Inserisci righe: ");
        n = scanner.nextInt();
        System.out.println("Inserisci colonne: ");
        m = scanner.nextInt();

        int[][] matrixB = new int[n][m];
        i = 0;

        do {
            int j = 0;
            do {
                System.out.println("Inserisci un numero: ");
                matrixB[i][j] = scanner.nextInt();
                j++;
            } while (j < m);
            i++;
        } while (i < n);
        System.out.println("La tua seconda matrice è: " + Arrays.deepToString(matrixB));

        int[][] matrixC = new int[n][m];
        i = 0;

        do {
            int j = 0;
            do {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                j++;
            } while (j < m);
            i++;
        }  while (i < n);
        System.out.println("La somma delle due matrici è: " + Arrays.deepToString(matrixC));
    }
}

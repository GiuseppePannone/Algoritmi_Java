import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci il numero di righe: ");
        int n = scanner.nextInt();
        System.out.print("inserisi il numero di colonne: ");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int i = 0;
        int somma = 0;
        do {
            int j = 0;
            do {
                System.out.print("scrivi un numero:");
                matrix[i][j] = scanner.nextInt();
                somma = somma + matrix[i][j];
               j++;
            } while (j<m);
            i++;
        } while (i<n);
        System.out.println("La matrice è: " + Arrays.deepToString(matrix));
        System.out.print("La somma dei numeri della matrice è: " + somma);
    }
}

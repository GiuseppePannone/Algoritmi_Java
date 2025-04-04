import java.util.Scanner;

public class MatrixCreator {
    private Scanner scanner;
    public MatrixCreator() {
        this.scanner = new Scanner(System.in);
    }
    public int[][] createAndPopulateMatrix() {
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
            } while(j < m);
            i++;
        } while (i < n);
        return matrix;
    }
}

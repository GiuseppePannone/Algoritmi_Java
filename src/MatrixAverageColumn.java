import java.util.Scanner;
import java.util.Arrays;

public class MatrixAverageColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensioni
        System.out.print("Inserisci numero di righe: ");
        int righe = scanner.nextInt();

        System.out.print("Inserisci numero di colonne: ");
        int colonne = scanner.nextInt();

        int[][] matrice = new int[righe][colonne];

        // Riempimento matrice
        System.out.println("Inserisci i valori della matrice:");
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print("Valore in posizione [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }

        // Array per le medie delle colonne
        double[] medieColonne = new double[colonne];

        // Calcolo media per ogni colonna
        for (int j = 0; j < colonne; j++) {
            int somma = 0;
            for (int i = 0; i < righe; i++) {
                somma += matrice[i][j];
            }
            medieColonne[j] = (double) somma / righe;
        }

        // Stampa delle medie
        System.out.println("\nMedie delle colonne:");
        System.out.println(Arrays.toString(medieColonne));
    }
}

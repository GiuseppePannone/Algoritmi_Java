import java.util.Scanner;

public class MatrixPositionElement {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("inserisci numero di righe: ");
            int n = scanner.nextInt();
            System.out.print("inserisci numero di colonne: ");
            int m = scanner.nextInt();

            int[][] matrix = new int[n][m];

            System.out.println("Inserisci i valori della matrice:");
            int i = 0;
            while(i < n){
                int j = 0;
                while(j < m){
                    System.out.print("Valore in posizione [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                    j++;
                }
                i++;
            }

            int max = matrix[0][0];
            int maxRiga = 0;
            int maxColonna = 0;

            i=0;
            while(i < n){
                int j = 0;
                while(j < m) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                        maxRiga = i;
                        maxColonna = j;
                    }
                    j++;
                }
                i++;
            }

            System.out.println("Il numero più grande è: " + max);
            System.out.println("Si trova in posizione: [" + maxRiga + "][" + maxColonna + "]");
        }
}

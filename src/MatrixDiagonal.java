import java.util.Scanner;
import java.util.Arrays;

public class MatrixDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci il numero di righe della matrice: ");
        int n = scanner.nextInt();
        System.out.print("inserisci il numero di colonne della matrice: ");
        int m = scanner.nextInt();
        int[][] matrixD = new int[n][m];

        boolean continua = true;

        int i = 0;
        do {
            int j = 0;
            do{
                System.out.print("scrivi il " + (j+i+1) + "° numero della matrice: ");
                matrixD[i][j] = scanner.nextInt();


                if(i == j){
                    if(matrixD[i][j] != 1){
                        continua = false;
                    }
                } else {
                    if(matrixD[i][j] != 0){
                        continua = false;
                    }
                }
                j++;
            } while (j < m && continua == true /* continua */);
            i++;
        } while (i<n && continua);
        if(continua) {
            System.out.println("ecco la matrice: " + Arrays.deepToString(matrixD));
            System.out.print("La matrice ha la diagonale?? " + continua);
        } else {
            System.out.println("ecco la matrice: " + Arrays.deepToString(matrixD));
            System.out.print("La matrice ha la diagonale?? " + continua);
        }
    }
}

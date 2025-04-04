import java.util.Arrays;

public class MatrixForArray {
//    Data una matrice[n][m] e un vettore [m] riempire un vettore[n] con il prodotto delle righe della matrice con il vettore
public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {1, 3, 1, 6},
            {6, 4, 9, 2},
            {5, 10, 3, 4}
    };

    int[] arrayCol = new int[] {1,2,3,4};
    int[] arrayRow = new int[matrix.length];

    int i = 0;
    while (i < matrix.length) {
        int j = 0;
        int somma = 0;
        while (j < matrix[i].length) {
            somma += matrix[i][j] * arrayCol[j];
            j++;
        }
        arrayRow[i] = somma;
        i++;
    }
    System.out.println(Arrays.toString(arrayRow));
}
}

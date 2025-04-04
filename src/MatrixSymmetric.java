import java.util.Arrays;

public class MatrixSymmetric {
    public static void main(String[] args) {

        int matrix[][] = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        boolean simmetrica = true;

        int i = 0;
        while (i < n && simmetrica) {
            int j = 0;
            while (j < m && simmetrica) {
                if (matrix[i][j] != matrix[j][i]) {
                    simmetrica = false;
                }
                j++;
            }
            i++;
        }
        System.out.println("la matrice: " + Arrays.deepToString(matrix));
        System.out.println("la matrice è simmetrica?? " + simmetrica);
    }
}
// solo nel caso in qui i numeri sono diversi sulla diagonale ritorna falso
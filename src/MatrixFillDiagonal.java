import java.util.Arrays;
import java.util.Scanner;

public class MatrixFillDiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
//                ,{0,0,0}
        };
        System.out.println("ecco la matrice di origine " + Arrays.deepToString(matrix));

        boolean continua = true;
        int n = matrix.length;
        int m = matrix[0].length;

        if(n == m) {
            int i = 0;
            while (i < n) {
                matrix[i][n - 1 - i] = 1;
                i++;
            }
            // questo while fatto da Antonella
            System.out.println("ecco la matrice finale" + Arrays.deepToString(matrix));
        } else {
            System.out.println("La matrice non è quadrata: " + n + " x " + m);
        }

    }
}





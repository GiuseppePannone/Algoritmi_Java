import java.util.Arrays;

public class MatrixDoubleDIagonal {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        int n = matrix.length;
        int m = matrix[0].length;
        boolean diagonaleX = true;

        if (n == m) {

            int i = 0;
            while (i < n) {

                int j = 0;
                while (j < m) {

                    if (i == j || i + j == n - 1) {
                        if (matrix[i][j] != 1) {
                            diagonaleX = false;
                        }
                    } else {
                        if (matrix[i][j] != 0) {
                            diagonaleX = false;
                        }
                    }

                    j++;
                }
                i++;
            }
        } else {
            diagonaleX = false;
        }

        if(diagonaleX) {
            System.out.print("Matrice: ");
            System.out.println(Arrays.deepToString(matrix));
            System.out.println("gli uno formano una X? " + diagonaleX);
        } else {
            System.out.print("Matrice: ");
            System.out.println(Arrays.deepToString(matrix));
            System.out.println("gli uno formano una X? " + diagonaleX);
        }
    }

}
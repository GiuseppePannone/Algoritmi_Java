import java.util.Arrays;

public class MatrixRowColumnCentral2 {
    public static void main(String[] args) {

        int matrix[][] = {
                {0, 0, 77, 0, 0},
                {0, 0, -12, 0, 0},
                {2, 88, -8, 9, -99},
                {0, 0, 31, 0, 0},
                {0, 0, 40, 0, 0}
        };

        int n = matrix.length;
        int m = matrix[0].length;
        boolean croce = true;
        int y = (n - 1) / 2;

        int min = 0;
        int max = 0;

        System.out.println(y);

        if (n/m == 1 && n%2 == 1) {

            int i = 0;
            while (i < n && croce == true) {

                int j = 0;
                while (j < m && croce == true) {

                    if (i == y || j == y) {
                        if (matrix[i][j] == 0) {
                            croce = false;
                        }
                        if(croce && min > matrix[i][j]){
                            min = matrix[i][j];
                        }
                        if(croce && max < matrix[i][j]){
                            max = matrix[i][j];
                        }
                    }
                    j++;
                }
                i++;
            }
        }
        System.out.println("matrice: " + Arrays.deepToString(matrix));
        System.out.println("ha una croce centrale la matrice?? " + croce);
        System.out.println("ecco il num massimo della croce: " + max);
        System.out.println("ecco il num minimo della croce: " + min);


    }
}


import java.util.Arrays;

public class MatrixFirstColumnOneRestZero {
    public static void main(String[] args) {

        int matrix[][] = {
                {1, 0, 0},
                {1, 0, 0},
                {1, 0, 0}
        };

        boolean colonna1 = true;

        int n = matrix.length;
        int m = matrix[0].length;

        int j = 0;
        while (j < m && colonna1) {
            int i = 0;
            while (i < n && colonna1) {
                if (j == 0) {
                    if (matrix[i][j] == 1) {
                        colonna1 = true;
                    } else {
                        colonna1 = false;
                    }
                } else {
                    if (matrix[i][j] == 0) {
                        colonna1 = true;
                    } else {
                        colonna1 = false;
                    }
                }
                i++;
            }
            j++;
        }
        if(colonna1){
            System.out.println("la matrice: " + Arrays.deepToString(matrix));
            System.out.println("la matrice ha solo la prima colonna di 1?? " + colonna1);
        } else {
            System.out.println("la matrice: " + Arrays.deepToString(matrix));
            System.out.println("la matrice ha solo la prima colonna di 1?? " + colonna1);
        }
    }

}


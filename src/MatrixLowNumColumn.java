

//public class MatrixLowNumColumn {
//    public static void main(String[] args) {
//
//        int matrix[][] = {
//                {8,5,3,4},
//                {1,2,7,6},
//                {8,2,0,3}
//        };
//        int n = matrix.length;
//        int m = matrix[0].length;
//
//        int matrix2[] ;
//
//        int j = 0;
//        int min = matrix[0][j];
//        int y = 0;
//
//
//        while(j < m) {
//            int i = 0;
//            while(i < n) {
//                if(matrix[i][j] <= min) {
//                    matrix2[y] = matrix[i][j];
//                }
//
//                i++;
//            }
//            j++;
//        }
//
//    }
//}


import java.util.Arrays;

public class MatrixLowNumColumn {
    public static void main(String[] args) {

        int[][] matrix = {
                {8, 5, 3, 4},
                {1, 2, 7, 6},
                {8, 2, 0, 3}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        int[] minimiColonna = new int[m];

        int j = 0;
        while (j < m) {
            int i = 0;
            int min = matrix[0][j];

            while (i < n) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                i++;
            }
            minimiColonna[j] = min;
            j++;
        }
        System.out.println("ecco la matrice originale:" + Arrays.deepToString(matrix));
        System.out.println("Numeri minimi per colonna:" + Arrays.toString(minimiColonna));
    }
}

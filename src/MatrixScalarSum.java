public class MatrixScalarSum {
//    Somma scalare di due matrici
public static void main(String[] args) {
    int[][] matrixA = new int[][] {
            {1,3,1},
            {6,4,9}
    };
    int[][] matrixB = new int[][] {
            {-1, -3, -1},
            {-6, -4, -9}
    };

    boolean zero = true;

    int i = 0;

    while(i < matrixA.length && zero) {
        int j = 0;
        while (j < matrixA[i].length && zero) {
            if(matrixA[i][j] + matrixB[i][j] != 0) {
                zero = false;
            }
            j++;
        }
        i++;
    }
    System.out.println(zero);
}
}

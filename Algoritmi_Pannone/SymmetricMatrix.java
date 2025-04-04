public class SymmetricMatrix {
//    Verificare che la matrice sia simmetrica, cioè A[i][j] = A[j][i]
public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {0,1},
            {1,2}
    };

    boolean symmetric = true;
    int i = 0;
    while(i < matrix.length && symmetric) {
        int j = 0;
        while (j < matrix[i].length && symmetric) {
            if(matrix[i][j] != matrix[j][i]) {
                symmetric = false;
            }
            j++;
        }
        i++;
    }
    System.out.println(symmetric);
}
}

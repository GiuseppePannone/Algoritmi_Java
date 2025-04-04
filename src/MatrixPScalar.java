import java.util.Arrays;

public class MatrixPScalar {
    public static void main(String[] args) {

        int matrix[][] = {
                {1, 2, 3, 1},
                {4, 5, 6, 1},
                {7, 8, 9, 1}
        };
        int n = matrix.length;
        int m = matrix[0].length;

        int[] vettore1 = {1,2,3,4};
        int[] vettore2 = new int[n];

        int i = 0;
        while(i < n) {
            int j = 0;
            while(j < m){
                vettore2[i] = vettore2[i]+(matrix[i][j] * vettore1[j]);
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(vettore2));
    }
}

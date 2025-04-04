import java.util.Scanner;
import java.util.Arrays;

public class MatrixSumOfTwo {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] b = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
                //,{3, 3, 3}
        };

        int n = a.length;
        int m = a.length;
        int[][] c = new int[n][m];

        System.out.println("ecco la matrice A: " + Arrays.deepToString(a));
        System.out.println("ecco la matrice B: " + Arrays.deepToString(b));

        if (a.length == b.length && a[0].length == b[0].length) {
            int i = 0;
            do {
                int j = 0;
                do {
                    c[i][j] = a[i][j] + b[i][j];
                    j++;
                } while (j < m);
                i++;
            } while (i < n);
            System.out.print("ecco la matrice C: " + Arrays.deepToString(c) + " , che è la somma di A + B");
        } else {
            System.out.println("La matrice A e la matrice B non corrispondono ");
            System.out.print("La matrice A : " + a.length + " x " + a[0].length + "  mentre la B : " + b.length + " x " + b[0].length );
        }
    }
}

import java.util.Arrays;

public class MatrixEqual {
    public static void main(String[] args) {

        int[][] b = {
                {0,0,0},
                {1,0,0},
                {1,1,0}
        };
        int[][] a = {
                {0,0,0},
                {1,0,0},
                {1,1,0}
        };

        int n = a.length;
        int m = a[0].length;
        int i = 0;
        boolean uguali = true;

        while(i < n && uguali) {
            int j = 0;
            while(j < m && uguali) {
                if(a[i][j] != b[i][j]) {
                    uguali = false;
                }
                j++;
            }
            i++;
        }
        if(uguali) {
            System.out.println("Matrice a:  " + Arrays.deepToString(a));
            System.out.println("Matrice b:  " + Arrays.deepToString(b));
            System.out.println("le due matrici sono uguali");
        } else {
            System.out.println("Matrice a:  " + Arrays.deepToString(a));
            System.out.println("Matrice b:  " + Arrays.deepToString(b));
            System.out.println("le due matrici sono diaversi");
        }
    }
}

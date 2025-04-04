import java.util.Arrays;

public class Matrix2Verification {
    public static void main(String[] args) {

        int matrix[][] = {
                {2,1},
                {3,4},
                {3,3}
        };
        int matrix2[][] = {
                {2,1},
                {3,4},
                {3,3}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        boolean uguali = true;

        int i = 0;
        while(i < n && uguali){
            int j = 0;
            while(j < m && uguali){
                if(matrix[i][j] != matrix2[i][j]){
                    uguali = false;
                }
                j++;
            }
            i++;
        }

        System.out.println("la prima matrice: " + Arrays.deepToString(matrix));
        System.out.println("la seconda matrice" + Arrays.deepToString(matrix2));
        System.out.println("Sono uguali?? " + uguali);


    }
}

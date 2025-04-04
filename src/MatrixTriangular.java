import java.util.Arrays;

public class MatrixTriangular {
    public static void main(String[] args) {

        int[][] matrix = {
                {0,0,0},
                {1,0,0},
                {1,1,0}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = 0;
        boolean triangolare = true;

        while(i < n && triangolare == true) {
            while(j < m && triangolare == true) {
                if(matrix[i][j] != 0){
                    triangolare = false;
                }
                j++;
            }
            i++;
            j = i;
        }
        if(triangolare){
            System.out.println("ecco la matrice: " + Arrays.deepToString(matrix));
            System.out.println("la matrice è triangolare inferiore??  " + triangolare);
        } else {
            System.out.println("ecco la matrice: " + Arrays.deepToString(matrix));
            System.out.println("la matrice è triangolare inferiore??  " + triangolare);
        }


    }
}

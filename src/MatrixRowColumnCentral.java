import java.util.Arrays;

public class MatrixRowColumnCentral {
    public static void main(String[] args) {

        int matrix[][] = {
                {0,1,0},
                {1,1,1},
                {0,1,0}
        };

        int n = matrix.length;
        int m = matrix[0].length;
        boolean croce = true;
        int y = (n-1)/2;

        System.out.println(y);

        if((n-1)/2 != 0){

            int i = 0;
            while(i < n){

                int j = 0;
                while(j < m){

                    if(i==y || j==y){
                        if(matrix[i][j] != 1){croce = false;}
                    } else {
                        if(matrix[i][j] != 0){croce = false;}
                    }
                    j++;
                }
                i++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(croce);

    }
}

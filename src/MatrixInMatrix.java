import java.util.Arrays;

public class MatrixInMatrix {
    public static void main(String[] args) {

        int matrix[][] = {
                {1, 2, -8, 3, -18, 3},
                {-2, 1, 1, 1, 5, -22},
                {-3, 1, 1, 1, 6, 88},
                {20, 1, 1, 1, -66, 6},
                {11, 33, -9, -77, 10, 7},
        };
        int n = matrix.length;
        int m = matrix[0].length;

        int matrix2[][] = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };

        int r = 1;
        int c = 1;
        int rMax = 0;
        int cMax = 0;


        int i = 0;
        int j = 0;
        while(i < n) {
            j=0;
            r=1;
            while(j < m){
                if(matrix[i][j] == 1 && matrix[i][j+1] == 1){
                    r++;
                    rMax = r;
                }
                j++;
            }
            i++;
        }

        i=0;
        j=0;
        while(j <m){
            i=0;
            c=1;

            while(i < n) {
                if(matrix[i][j] == 1 && matrix[i+1][j] == 1) {
                    c++;
                    cMax = c;
                }

                i++;
            }
            j++;
        }

        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(cMax);
        System.out.println(rMax);


    }
}

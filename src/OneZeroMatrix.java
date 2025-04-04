public class OneZeroMatrix {
//    Verifica che una matrice abbia "1" nella posizione centrale e "0" nelle altre
public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {0,0,1,0,0},
            {0,0,1,0,0},
            {1,1,1,1,1},
            {0,0,1,0,0},
            {0,0,1,0,0},
    };

    boolean valid = true;
    if(matrix.length % 2 != 0) {
        int i = 0;
        while(i < matrix.length && valid) {
            int j = 0;
            while(j < matrix[i].length && valid) {
            if(i == matrix.length/2 || j == matrix[i].length/2) {
                if(matrix[i][j] != 1) {
                    valid = false;
                }
            } else {
                if(matrix[i][j] != 0) {
                    valid = false;
                }
            }
            j++;
            }
            i++;
        }
    } else {
        valid = false;
    }
    System.out.println(valid);
}

}

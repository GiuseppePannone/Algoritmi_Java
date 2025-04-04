public class FirstColOne {
//    Controllare che in una matrice ci siano tutti "1" nella prima colonna e "0" altrove
public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {1,0,0},
            {1,0,0}
    };
    boolean valid = true;
    int i = 0;
    while(i < matrix.length && valid) {
        int j = 0;
        while(j < matrix[i].length && valid) {
            if(j==0) {
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
    System.out.println(valid);
}
}

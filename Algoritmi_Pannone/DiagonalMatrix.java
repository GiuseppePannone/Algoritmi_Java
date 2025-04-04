public class DiagonalMatrix {
//    Verificare che una matrice abbia tutti 1 nella diagonale principale e inversa
public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {1,0,1},
            {0,1,0},
            {1,0,1}
    };
    boolean valid = true;
    if(matrix.length % 2 != 0) {
        int i = 0;
        while(i < matrix.length && valid) {
            if(matrix[i][i] != 1 || matrix[i][matrix[i].length-1-i] != 1) {
                valid = false;
            }
            i++;
        }
    } else {
        valid = false;
    }
    System.out.println(valid);
}
}

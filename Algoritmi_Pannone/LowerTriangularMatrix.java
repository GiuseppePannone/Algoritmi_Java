public class LowerTriangularMatrix {
//    Verificare che la matrice[n][n] sia triangolare inferiore
public static void main(String[] args) {

    int[][] matrix = new int[][] {
            {1,0,0,},
            {2,3,0},
            {4,5,6}
    };
     boolean triangular = true;
     int i = 0;

     while(i < matrix.length && triangular) {
         int j = i+1;
         while (j < matrix[i].length && triangular) {
             if(matrix[i][j] != 0) {
                 triangular = false;
             }
             j++;
         }
         i++;
     }
    System.out.println(triangular);
}
}

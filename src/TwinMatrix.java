public class TwinMatrix {
//    Verificare che due matrici siano uguali
public static void main(String[] args) {
    int[][] matrixA = new int[][] {
            {1,0,0},
            {2,3,0},
            {4,5,6}
    };
    int[][] matrixB = new int[][] {
            {1,0,1},
            {2,3,0},
            {4,5,6}
    };

    boolean twin = true;
    int i = 0;
    while(i < matrixA.length && twin) {
        int j = 0;
        while(j < matrixA[i].length && twin) {
            if(matrixA[i][j] != matrixB[i][j]) {
                twin = false;
            }
            j++;
        }
        i++;
    }
    System.out.println(twin);
}
}

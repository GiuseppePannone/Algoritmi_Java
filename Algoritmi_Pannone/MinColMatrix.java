import java.util.Arrays;

public class MinColMatrix {
//    Trovare il valore minimo di ogni colonna e salvarlo in un vettore
public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {9,8,2},
            {3,6,5},
            {4,1,9}
    };

    int[] array = new int[matrix[0].length];
    int i = 0;
    while ( i < matrix[0].length) {
        int min = matrix[0][i];
        int j = 1;
        while (j < matrix.length) {
            if(matrix[j][i] < min) {
                min = matrix[j][i];
            }
            j++;
        }
        array[i] = min;
        i++;
    }
    System.out.println("Minimo di ogni colonna: " + Arrays.toString(array));
}
}

public class MatrixMinMax {
//    Controllare che una matrice abbia valori diversi da 0 nelle posizioni centrali e calcolare il Minimo e il Massimo
public static void main(String[] args) {
    int[][] matrix = new int[][] {
            {0,4,0},
            {6,5,1},
            {0,4,0}
    };

    int center = matrix.length/2;
    int min = 0;
    int max = 0;
    if(matrix.length == matrix[0].length) {
        if(matrix.length % 2 != 0) {
            boolean check = true;
            int i = 0;
            while (i < matrix.length && check) {
                if(matrix[i][center] == 0 || matrix[center][i] == 0) {
                    check = false;
                }
                i++;
            }
            if(matrix[0][center] < matrix[center][0]) {
                min = matrix[0][center];
                max = matrix[center][0];
            } else {
                min = matrix[center][0];
                max = matrix[0][center];
            }
            i=1;
            while (i < matrix.length) {
                if(matrix[i][center] < min || matrix[center][i] < min) {
                    if(matrix[i][center] < matrix[center][i]) {
                        min = matrix[i][center];
                    } else {
                        min = matrix[center][i];
                    }
                }
                i++;
            }
            i = 1;
            while(i < matrix.length) {
                if(matrix[i][center] > max || matrix[center][i] > max) {
                    if (matrix[i][center] > matrix[center][i]) {
                        max = matrix[i][center];
                    } else {
                        max = matrix[center][i];
                    }
                }
                i++;
            }
        }
    }
    System.out.println("Minimo delle colonne/righe centrali: " + min);
    System.out.println("Massimo delle colonne/righe centrali: " + max);
}
}

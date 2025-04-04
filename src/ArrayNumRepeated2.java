import java.util.Arrays;

public class ArrayNumRepeated2 {
    public static void main(String[] args) {

        int[] v = {1, 2, 2, 2, 3, 4, 4, 5, 6, 6, 6, 6, 7};

        int[] numeriRipetuti = new int[v.length]; // INDICA I NUMERI CHE SI RIPETONO
        int[] contatori = new int[v.length]; // QUANTE VOLTE SI RIPETONO I NUMERI
        int indice = 0; // PER LA POSIZIONE DEI 2 ARRAY

        int i = 0;
        while (i < v.length - 1) {
            int count = 1;
            while (i < v.length - 1 && v[i] == v[i + 1]) {
                count++;
                i++;
            }

            if (count > 1) {
                numeriRipetuti[indice] = v[i];
                contatori[indice] = count;
                indice++;
            }
            i++;
        }

        numeriRipetuti = Arrays.copyOf(numeriRipetuti, indice);
        contatori = Arrays.copyOf(contatori, indice);


        System.out.println("Array originale: " + Arrays.toString(v));
        System.out.println("Numeri ripetuti: " + Arrays.toString(numeriRipetuti));
        System.out.println("Ripetizioni:     " + Arrays.toString(contatori));
    }
}
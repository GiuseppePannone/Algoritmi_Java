import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la grandezza dell'array: ");
        int n = scanner.nextInt();

        // riempiArray() = metodo
        // MethodArrayFill = classe
        int[] array = MethodArrayFill.riempiArray(n);

        int[] pari = new int[n];
        int[] dispari = new int[n];
        int j = 0;
        int k = 0;

        int i = 0;
        while (i < n) {
            if (array[i] % 2 == 0) {
                pari[j] = array[i];
                j++;
            } else {
                dispari[k] = array[i];
                k++;
            }
            i++;
        }
        System.out.println("Numeri pari: " + Arrays.toString(Arrays.copyOf(pari, j)));
        System.out.println("Numeri dispari: " + Arrays.toString(Arrays.copyOf(dispari, k)));
        System.out.println(Arrays.toString(pari));
    }
}
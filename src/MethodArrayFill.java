// USATO IN
// - ArrayEvenOdd.java
// -

import java.util.Scanner;

public class MethodArrayFill {
    public static int[] riempiArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        int i = 0;

        while (i < n) {
            System.out.print("Inserisci il " + (i + 1) + "° numero: ");
            array[i] = scanner.nextInt();
            i++;
        }
        return array;
    }
}
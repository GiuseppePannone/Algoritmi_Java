import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dimensione vettore: ");
        int[] array = new int[scanner.nextInt()];
        array[0] = 0;
        array[1] = 1;
        int i = 2;

        while (i < array.length) {
            array[i] = array[i-2] + array[i-1];
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}

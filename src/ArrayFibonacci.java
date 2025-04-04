import java.util.Scanner;
import java.util.Arrays;

public class ArrayFibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dimensione vettore: ");
        int[] vettore = new int[scanner.nextInt()];

        vettore[0] = 0;
        vettore[1] = 1;
        int i = 2;
        while (i < vettore.length) {
            vettore[i] = vettore[i - 2] + vettore[i - 1];
            i += 1;
        }
        System.out.println(Arrays.toString(vettore));
    }
}

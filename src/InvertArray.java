import java.util.Arrays;
import java.util.Scanner;

public class InvertArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int temp = 0;
        System.out.println("Inserisci la grandezza dell'array: ");
        int[] array = new int[scanner.nextInt()];
        do {
            System.out.println("Inserisci un numero: ");
            array[i] = scanner.nextInt();
            i++;
        } while(i < array.length);
        i=0;

        do {
            int j = array.length - i - 1;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
        } while (i < array.length/2);
        System.out.println(Arrays.toString(array));

    }
}

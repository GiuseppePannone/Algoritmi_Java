import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = 0;
            int i = 0;
            int temp = 0;
            System.out.print("Inserisci la grandezza dell'array: ");
            int[] array = new int[scanner.nextInt()];

            do {
                System.out.print("Inserisci il " + (i+1) + "° numero dell'array: ");
                array[i] = scanner.nextInt();
                i += 1;
            } while (i < array.length);
            i = 0;
            System.out.println("L'array originale è: " + Arrays.toString(array));
            do {
                int j = array.length - i - 1;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i += 1;
            } while (i < array.length / 2);

            System.out.print("L'array invertito è: " + Arrays.toString(array));

        }

    }

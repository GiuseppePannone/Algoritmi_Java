import java.util.Scanner;
import java.util.Arrays;

public class ArrayFill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Inserisci la grandezza dell'array: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        int cont = 0;
        do{
            System.out.print("Inserisci il " + (cont+1) + "° numero dell'array : ");
            array[cont] = scanner.nextInt();
            cont++;
        } while (cont < n);
        System.out.println("L'Array che hai composto è: " + Arrays.toString(array));
    }
}

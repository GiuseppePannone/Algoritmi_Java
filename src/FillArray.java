import java.util.Arrays;
import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Inserisci la grandezza dell'array: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        int cont = 0;
        do{
            System.out.print("Inserisci un numero: ");
            array[cont] = scanner.nextInt();
            cont++;
        } while (cont < n);
        System.out.println(Arrays.toString(array));
    }
}

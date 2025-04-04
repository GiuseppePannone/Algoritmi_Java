import java.util.Scanner;
import java.util.Arrays;

public class ArrayMaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la grandezza dell'array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int cont = 0;
        do{
            System.out.print("Inserisci il " + (cont+1) + "° numero: ");
            array[cont] = scanner.nextInt();
            cont++;
        } while (cont < n);
        System.out.println("ecco l'array che hai composto: " + Arrays.toString(array));
        // TROVA IL NUMERO PIU GRANDE
        int max = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        System.out.println("Il numero più grande è: " + max);
    }
}

import java.util.Scanner;


public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Determina la grandezza dell'array: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        int i = 0;
        int somma = 0;
        do{
            System.out.print("Inserisci il " + (i+1) + "° numero dell'array: ");
            array[i] = scanner.nextInt();
            somma = somma + array[i];
            i++;
        } while (i < array.length);
        System.out.println("La somma dell'array inserito è " + somma);
    }
}

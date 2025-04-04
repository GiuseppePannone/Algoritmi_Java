import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza del vettore: ");
        int[] vettore = new int[scanner.nextInt()];
        int i = 0;
        do {
            System.out.println("Inserisci un numero: ");
            vettore[i] = scanner.nextInt();
            i++;
        } while (i < vettore.length);
         boolean palindrome = true;
         i = 0;
        int j = vettore.length - 1;
         do {
             if (vettore[i] != vettore[j]) {
                 palindrome = false;
                 break;
             }
             i++;
             j--;
         } while (i < vettore.length - 1);
        System.out.println(palindrome);
    }
}

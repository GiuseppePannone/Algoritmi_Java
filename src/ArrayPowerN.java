import java.util.Arrays;
import java.util.Scanner;

public class ArrayPowerN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci un numero tra i vari  2, 5, 10 :  ");
        int n = scanner.nextInt();

        int[] potenze = new int[n];

        int i = 0;
        while (i < n) {
            potenze[i] = (int)Math.pow(2, i); // 2 elevato alla i
            i++;
        }

        System.out.println("Le prime " + n + " potenze di 2:");
        System.out.println(Arrays.toString(potenze));
    }
}
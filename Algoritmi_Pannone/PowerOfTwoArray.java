import java.util.Arrays;
import java.util.Scanner;

public class PowerOfTwoArray {
//    Riempi un vettore di dimensione n con potenze di 2
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci le dimensioni dell'array: ");
    int[] array = new int[scanner.nextInt()];
    array[0] = 1;
    int i = 1;

    while(i < array.length) {
        array[i] = array[i-1]*2;
        i++;
    }
    System.out.println(Arrays.toString(array));
}
}

import java.util.Scanner;
import java.util.Arrays;

public class ArrayNumRepeated {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("indica la lungezza del vettore: ");
        int n = scanner.nextInt();
        int[] v = MethodArrayFill.riempiArray(n);

//        System.out.println(Arrays.toString(v));

        boolean ripetuti = false;
        int i = 0;
        while (i<n && !ripetuti) {
            int j = i + 1;
            while (j<n && !ripetuti) {
                if(v[i]==v[j]) {
                    System.out.print("il numero " + v[i] + " si ripete.");
                    ripetuti = true;
                }
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(v));
        System.out.print("il vettore ha numeri ripeuti?? " + ripetuti);
    }
}

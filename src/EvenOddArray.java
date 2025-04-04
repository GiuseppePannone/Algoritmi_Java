import java.util.Arrays;
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Inserisci la grandezza dell'array: ");
        n = scanner.nextInt();
        int[] array1 = new int[n];

        int evenCount = 0;
        int oddCount = 0;
        int i = 0;

        do{
            System.out.print("Inserisci un numero: ");
            array1[i] = scanner.nextInt();
            i++;
        } while (i < n);

        i = 0;
        do {
            if(array1[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            i++;
        } while (i < array1.length);
            int[] evenArray = new int[evenCount];
            int[] oddArray = new int[oddCount];

            i = 0;
            int j = 0, k = 0;

            do {
                if(array1[i] % 2 == 0) {
                    evenArray[j] = array1[i];
                    j++;
                } else {
                    oddArray[k] = array1[i];
                    k++;
                }
                i++;
            } while (i < array1.length);



        System.out.println(Arrays.toString(evenArray) +  " ," + Arrays.toString(oddArray) );
    }
}

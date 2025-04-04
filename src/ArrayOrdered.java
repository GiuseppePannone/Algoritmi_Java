import java.util.Scanner;
import java.util.Arrays;

public class ArrayOrdered {

   // public class OrderedArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = 0;
            System.out.print("Determina la grandezza dell'array: ");
            n = scanner.nextInt();
            int i = 0;
            int temp = 0;
            int[] array = new int[n];
            do {
                System.out.print("Inserisci il " + (i+1) + "° numero dell'array: ");
                array[i] = scanner.nextInt();
                i++;
            } while(i < array.length);
            i = 0; // DA QUI PARTE IL RIORDINAMNETO DELL'ARRAY ↓
            do {

                int j = 0;
                do {
                    if(array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j +1];
                        array[j + 1] = temp;
                        j++;
                    } else {
                        j++;
                    }

                } while(j < array.length - 1 - i);
                i++;
            } while(i < array.length);
            System.out.println("ecco l'array che hai composto" + Arrays.toString(array));
        }
    }

//}

/*public static void main(String[] args) {
    psvm tab
}*/
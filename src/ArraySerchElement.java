import java.util.Scanner;

public class ArraySerchElement {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Inserisci la grandezza del vettore");
            int n = scan.nextInt();
            int[] array = new int[n];

            int i = 0;
            while (i < n) {
                System.out.println("Inserisci il numero da inserire nel vettore: ");
                array[i] = scan.nextInt();;
                i++;
            };


            i = 0;
            boolean trovato = false;
            int num;
            System.out.println("inserisci il numero da cercare");
            num = scan.nextInt();

            while (i < n) {
                if(array[i] == num) {
                    trovato = true;
                }
                i++;
            };
            if(trovato) {
                System.out.println("il numero è presente all'interno dell'array");
            } else {
                System.out.println("il numero non è presente all'interno dell'array");
            }







        }

    }



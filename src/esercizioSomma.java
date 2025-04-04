/*public class esercizioSomma {
    public static void main(String[] args){
        System.out.println("ciao1");
    }
}*/

//import java.util.Arrays
//import java.util.Scanner

import java.util.Scanner;

public class esercizioSomma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("inserisci la grandezza dell'array");
        n = scanner.nextInt();




    }
}



/* esercizi di giuseppe
1° Ordinamento array
public class OrderedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Determina la grandezza dell'array: ");
        n = scanner.nextInt();
        int i = 0;
        int temp = 0;
        int[] array = new int[n];
        do {
            System.out.println("Inserisci un numero: ");
            array[i] = scanner.nextInt();
            i++;
        } while(i < array.length);
        i = 0;
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
        System.out.println(Arrays.toString(array));
    }
}



2° SOMMA ARRAY
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
            System.out.println("Inserisci un numero: ");
            array[i] = scanner.nextInt();
            somma = somma + array[i];
            i++;
        } while (i < array.length);
        System.out.println(somma);
    }
}





3° RIEMPIMENTO ARRAY
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


4° MAX TRA 5 NUMERI
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





5° SOMMA TRA 5 NUMERI
public class Algoritmo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0;
        int contatore = 0;
        do {
            System.out.println("Inserisci un numero");
            contatore = contatore + 1;
            somma = somma + scanner.nextInt();
        } while(contatore < 5);
        System.out.println(somma);
    }
}



VERONI ARRAY INVERTI


package algoritmi;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int temp = 0;
        System.out.println("Inserisci la grandezza dell'array: ");
        int[] array = new int[scanner.nextInt()];

        do{
            System.out.println("Inserisci un numero: ");
            array[i]= scanner.nextInt();
            i +=1;
        }while(i < array.length);
        i = 0;

        do {
            int j = array.length-i-1;
            temp = array[i];
            array[i]=array[j];
            array[j]= temp;
            i +=1;
        }while(i < array.length/2);

        System.out.print("L'array invertito è: " + Arrays.toString(array));

    }
}





CARICARE UNA MATRICE
package algoritmi;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci colonne: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        int i = 0;



        do{
            int j = 0;
            do{
                System.out.println("Inserisci numero: ");
                matrix[i][j] = scanner.nextInt();
                j++;
            }while(j < m);
            i++;
        }while(i < n);
        System.out.print("La matrice è: " + Arrays.deepToString(matrix));


    }
}






 */
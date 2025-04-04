import java.util.Scanner;

public class FindElementArray {
//    Ricerca di un elemento all'interno di un vettore
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = {1, 4, 5, 7, 9};
    System.out.println("Inserisci il numero da cercare: ");
    int num = scanner.nextInt();

    int i = 0;
    boolean found = false;
    while(i < array.length) {
        if(array[i] == num) {
            found = true;
        }
        i++;
    };
    if(found) {
        System.out.println("numero trovato");
    } else {
        System.out.println("numero non trovato");
    }

}
}

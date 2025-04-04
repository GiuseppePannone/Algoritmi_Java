import java.util.Scanner;

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


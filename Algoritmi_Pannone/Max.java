import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int cont = 0;
        do {
            System.out.println("Inserisci un numero");
            int numero = scanner.nextInt();
            if(numero > max) {
                max = numero;
            }
            cont = cont + 1;
        } while(cont < 5);
        System.out.println("Il numero massimo è:" + max);
    }
}


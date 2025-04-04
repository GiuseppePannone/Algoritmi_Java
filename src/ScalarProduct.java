public class ScalarProduct {
//    Dati 2 vettori V = [2, 4, 8, 16] e V2 = [3, 6, 9, 12] crea un terzo vettore V3 che contenga il prodotto scalare dei 2 vettori
public static void main(String[] args) {
    int[] arrayA = new int[] {2,4,8,16};
    int[] arrayB = new int[] {3,6,9,12};

    int[] arrayC = new int[1];

    int sommaProdotto = 0;
    int i = 0;
    while(i < arrayA.length) {
        sommaProdotto += arrayA[i] * arrayB[i];
        i++;
    }
    arrayC[0] = sommaProdotto;
    System.out.println("Il prodotto scalare dei due vettori è " + arrayC[0]);
}
}

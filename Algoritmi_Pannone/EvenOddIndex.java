public class EvenOddIndex {
//    Dato un array determina se ogni indice pari contiene un numero pari e se un numero dispari contiene un numero dispari
public static void main(String[] args) {
    boolean uguale = true;
    int[] array = new int[] {6,3,4,7,8,1};
    int i = 0;
    while(i < array.length && uguale) {
        if(i % 2 == 0) {
            if(array[i] % 2 != 0) {
                uguale = false;
            }
        }else {
            if(array[i] % 2 != 1) {
                uguale = false;
            }
        }
        i++;
    }
    System.out.println(uguale);
}
}

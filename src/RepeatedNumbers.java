public class RepeatedNumbers {
//    Dato un vettore V = [1,1,2,1,2,0,2] determinare se ci sono numeri ripetuti
public static void main(String[] args) {
    int[] array = new int[] {1,1,2,1,2,0,2};

    boolean repeat = false;
    int i = 0;

    while (i < array.length && !repeat) {
        int j = i +1;
        while (j < array.length && !repeat) {
            if(array[i] == array[j]) {
                repeat = true;
            }
            j++;
        }
        i++;
    }
    System.out.println(repeat);
}
}

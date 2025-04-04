//import java.util.Arrays;
//
//public class Array5Pages {
//    public static void main(String[] args) {
//
//        int[] vettore1 = {2, 3, 2, 3, 1, 3};
//        int[] vettore2 = {1, 2, 1, 2, 4, 4};
//
//        int n = vettore1.length;
//
//
//        int X = 0;
//        int i =0;
//        int j = 0;
//        while(i < n){
//            j=0;
//            while(j < n-1){
//
//                if(vettore1[j] > vettore1[j+1]){
//                    X = vettore1[j];
//                    vettore1[j] = vettore1[j+1];
//                    vettore1[j+1] = X;
//                }
//
//                if(vettore2[j] > vettore2[j+1]){
//                    X = vettore2[j];
//                    vettore2[j] = vettore2[j+1];
//                    vettore2[j+1] = X;
//                }
//
//                j++;
//            }
//            i++;
//        }
//
//        i=0;
//        j=0;
//        int e = 1;
//        int[] h1 = new int[n];
//        int[] h2 = new int[n];
//        while(i < n-1){
//            if(vettore1[i] == vettore1[i+1]){
//                j++;
//                e++;
//                h1[i-j] = vettore1[i];
//                h2[i-j] = e;
//            } else {
//                e = 1;
//            }
//            i++;
//        }
//
//        i=0;
//        j=0;
//        int f = 1;
//        int[] h3 = new int[n];
//        int[] h4 = new int[n];
//
//        while(i < n -1){
//            if(vettore2[i] == vettore2[i+1]){
//                i++;
//                f++;
//                h4[i-j] = vettore2[i];
//                h3[i-j] = f;
//            } else {
//                f = 1;
//            }
//            i++;
//        }
//
//        i=0;
//        j=0;
//        int somma = 0;
//
//        while(i <n){
//            somma = somma + h2[i] + h3[i];
//            i++;
//        }
//
//        System.out.println(Arrays.toString(Arrays.copyOf(h2, j)));
//        System.out.println(Arrays.toString(h1));
//        System.out.println(Arrays.toString(h3));
//        System.out.println(Arrays.toString(h4));
//        System.out.println(somma);
//
//
////        System.out.println("Numeri pari: " + Arrays.toString(Arrays.copyOf(pari, j)));
//    }
//}
//


import java.util.Arrays;

public class Array5Pages {
    public static void main(String[] args) {

        int[] vettore1 = {2, 3, 2, 3, 1, 3};
        int[] vettore2 = {1, 2, 1, 2, 4, 4};
        int n = vettore1.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (vettore1[j] > vettore1[j + 1]) {
                    int temp = vettore1[j];
                    vettore1[j] = vettore1[j + 1];
                    vettore1[j + 1] = temp;
                }
                if (vettore2[j] > vettore2[j + 1]) {
                    int temp = vettore2[j];
                    vettore2[j] = vettore2[j + 1];
                    vettore2[j + 1] = temp;
                }
            }
        }

        // Conta ripetizioni in vettore1
        int[] h1 = new int[n];
        int[] h2 = new int[n];
        int j1 = 0;
        int i = 0;
        while (i < n - 1) {
            int count = 1;
            while (i < n - 1 && vettore1[i] == vettore1[i + 1]) {
                count++;
                i++;
            }
            if (count > 1) {
                h1[j1] = vettore1[i];
                h2[j1] = count;
                j1++;
            }
            i++;
        }

        // Conta ripetizioni in vettore2
        int[] h3 = new int[n];
        int[] h4 = new int[n];
        int j2 = 0;
        i = 0;
        while (i < n - 1) {
            int count = 1;
            while (i < n - 1 && vettore2[i] == vettore2[i + 1]) {
                count++;
                i++;
            }
            if (count > 1) {
                h4[j2] = vettore2[i];
                h3[j2] = count;
                j2++;
            }
            i++;
        }

        // Calcola somma delle ripetizioni reali
        int somma = 0;
        for (i = 0; i < j1; i++) {
            somma += h2[i];
        }
        for (i = 0; i < j2; i++) {
            somma += h3[i];
        }

        // Stampa risultati tagliati
        System.out.println("Ripetizioni in vettore1:");
        System.out.println("Numeri:   " + Arrays.toString(Arrays.copyOf(h1, j1)));
        System.out.println("Quantità: " + Arrays.toString(Arrays.copyOf(h2, j1)));

        System.out.println("Ripetizioni in vettore2:");
        System.out.println("Numeri:   " + Arrays.toString(Arrays.copyOf(h4, j2)));
        System.out.println("Quantità: " + Arrays.toString(Arrays.copyOf(h3, j2)));

        System.out.println("Somma totale delle quantità: " + somma);
    }
}

//Napisati program koji učitava broj n i niz cijelih brojeva a dužine n. 
//Zatim se na osnovu ovog niza formira i ispisuje niz b u kojem se svaki element duplira. Na primjer, za niz a: [1, 2, 3], niz b je: [1, 1, 2, 2, 3, 3].

import java.util.Scanner;

public class Zad4 {

    public static int[] dupliranje(int[] a, int n) {
        int m = 2*n;
        int[] b = new int[m];

        for(int i = 0, j = 0; i < a.length; i++) {
            b[j] = a[i];
            b[j+1] = a[i];
            j += 2;
        }
         //ispis niza b
         for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite koliko elemenata ima niz:");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Unesite elemente u nizu:");
        for(int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(dupliranje(a, n));

       
    }
}

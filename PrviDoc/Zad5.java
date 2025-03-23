//Napisati program koji od niza cijelih brojeva a formira nizove b i c, tako da su elementi niza b parni elementi niza a, a elementi niza c neparni elementi.
//1 2 3 4 5 6 7 8 9

import java.util.Scanner;

public class Zad5 {

    public static int[][] ParniINeparniElementi(int[] a, int n) {
        int m = n/2;
        int s = n/2;
        int[] b = new int[m];
        int[] c = new int[s];

        for(int i = 0, j = 0, l = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                b[j] = a[i];
            } else {
                c[l] = a[i];
            }
        }

        //kako da sad vratim dva niza?
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
    }
}

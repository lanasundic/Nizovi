
//Napisati funkciju int maksimum(int a[]) koja izračunava maksimalni element u nizu.

import java.util.Scanner;

public class Zad1 {
    public static int maksimum(int[] niz) {
        int maxEl = niz[0];

        for(int i = 0; i < niz.length; i++) {
            if(niz[i] > maxEl) {
                maxEl = niz[i];
            }
        }
        return maxEl;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite koliko elemenata ima niz:");
        int x = scanner.nextInt();

        int[] niz = new int[x];
        System.out.println("Unesite elemente u nizu:");
        for(int i = 0; i < niz.length; i++) {
            niz[i] = scanner.nextInt();
        }

        System.out.println(maksimum(niz));
    }
}
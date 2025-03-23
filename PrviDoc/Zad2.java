//Napisati funkciju float prosjek(int a[]) koja izračunava srednju vrijednost niza cijelih brojeva.

import java.util.Scanner;

public class Zad2 {
    
    public static float prosjek(int a[]) {
        int zbir = 0;
        int cnt = 0;

        for(int i= 0; i < a.length; i++) {
            zbir += a[i];   //zbir svih elemenata
            cnt++;
        }
        float rez = (float) zbir/cnt;

        return rez;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite koliko elemenata ima niz:");
        int x = scanner.nextInt();

        int[] a = new int[x];
        System.out.println("Unesite elemente u nizu:");
        for(int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(prosjek(a));
    }
}

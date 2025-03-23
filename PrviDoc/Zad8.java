//Ako je polinom dat nizom svojih koeficijenata (npr. niz [2, 1, 5, 4] predstavlja polinom 2+x+5x^2+4x^3), 
//napisati funkciju float polinom(float a[], float x) koji izračunava vrijednost polinoma u tački x.

import java.util.Scanner;

public class Zad8 {

    /*public class Main {
        public static double pow(double baza, int eksponent) {
            return Math.pow(baza, eksponent);
        }
    }
    */

    public static float Polinom(float a[], float x) {
        int stepen = 1;
        int rezultat = 0;

        for(int i = 0; i < a.length; i++) {

            if(rezultat < 1) {
                rezultat += a[0];   //da ubacimo u rezultat prvi element, da bi se krenulo od drugog
            }
            rezultat += a[0];
            rezultat += a[i] * x^stepen;     //kako da stepenujem?
            stepen++;
        }
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

        System.out.println("Unesite x:");
        int x = scanner.nextInt();

    }
}

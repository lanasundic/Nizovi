//Ako je polinom dat nizom svojih koeficijenata (npr. niz [2, 1, 5, 4] predstavlja polinom 2+x+5x^2+4x^3), 
//napisati funkciju float polinom(float a[], float x) koji izračunava vrijednost polinoma u tački x.

import java.util.Scanner;

public class Zad8 {
    public static float Polinom(int a[], float x) {
        float rezultat = 0;
        float stepenovano = 1;
        for(int i = 0; i < a.length; i++) {
            if(i < 1) {
                rezultat += a[0];   //da ubacimo u rezultat prvi element, da bi se krenulo od drugog
                stepenovano = stepenovano * x;
            }
            else {
                rezultat += a[i] * stepenovano;
                stepenovano = stepenovano * x;
            }
        }
        return rezultat;
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
        float x = scanner.nextInt();

        System.out.println(Polinom(a, x));
    }
}

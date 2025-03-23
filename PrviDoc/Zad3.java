//Napisati funkciju int prebroj(int a[], int k)  koja izračunava koliko ima parnih brojeva većih od unesenog broja k u nizu cijelih brojeva a.

import java.util.Scanner;

public class Zad3 {

    public static int prebroj(int a[], int k) {
        int cnt = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > k && a[i] % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        System.out.println("Unesite koliko elemenata ima niz:");
        int x = scanner.nextInt();

        int[] a = new int[x];
        System.out.println("Unesite elemente u nizu:");
        for(int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(prebroj(a, k));
    }
}

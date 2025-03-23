//Napisati funkciju boolean sortiran(int a[]) koji provjerava da li je dati niz sortiran i ako jeste ispisuje u kom poretku je sortiran.

import java.util.Scanner;

public class Zad7 {
    
    public static boolean sortiran(int a[]) {
        boolean sort1 = false;
        boolean sort2 = false;
        //moramo li  da predpostavimo da niz u rastucem poretku?

        for(int i = 0; i < a.length; i++) {
            if(a[0] < a[1]) {
                sort1 = true;
            }
            if(a[0] > a[1]) {
                sort2 = true;
            }
        }
        if(sort1) {
            System.out.println("Niz je u rastucem poretku.");
        }
        if(sort2) {
            System.out.println("Niz je u opadajucem poretku.");
        }
                return false;   //sta da returnujem kad je boolean, stampa mi se false STALNO
        
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
        System.out.println(sortiran(a));
    }
}

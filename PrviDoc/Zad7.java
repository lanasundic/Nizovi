//Napisati funkciju boolean sortiran(int a[]) koja provjerava da li je dati niz sortiran i ako jeste ispisuje u kom poretku je sortiran.

import java.util.Scanner;

public class Zad7 {
    
    public static boolean sortiran(int a[]) {
        boolean sortUp = true;
        boolean sortDown = true;
       
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i + 1]) {
                sortUp = false;
            }
            if(a[i] < a[i + 1]) {
                sortDown = false;
            }
        }
        if(sortUp) {
            System.out.println("Niz je u rastucem poretku.");
            return true;
        }
        else if(sortDown) {
            System.out.println("Niz je u opadajucem poretku.");
            return true;
        }
        else
            return false;
        
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
        boolean sortirano = sortiran(a);
        if (!sortirano)
            System.out.println("Nismo dobri...");
    }
}

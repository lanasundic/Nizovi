//⦁	Napisati program koji učitava niz cijelih brojeva i provjerava da li u tom nizu ima duplikata (elemenata koji se javljaju više od jednog puta).

import java.util.Scanner;

public class Zad11 {

    public static String Duplikat(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    return "Ima";
                }  
            }
        }
        return "Niz nema duplikata.";
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
        System.out.println(Duplikat(a));
        
    }
}

//⦁	Napisati program koji učitava niz od n prirodnih brojeva. 
//Svaki element niza je broj manji ili jednak n. Program treba da odštampa sve prirodne brojeve manje ili jednake n koji se ne pojavljuju u unesenom nizu.

import java.util.Scanner;

public class Zad12 {

    public static int[] BrojeviKojiSuManjiIliJednakisaN(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            
        }
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite koliko elemenata ima niz:");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Unesite elemente u nizu koji su manji ili jednaki n:");
        for(int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

    }
}

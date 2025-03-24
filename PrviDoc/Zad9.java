//Napisati program koji u datom nizu cijelih brojeva a pronalazi sve indekse i takve da važi da je suma elemenata niza prije elementa a[i] jednaka sumi elemenata 
//nakon tog elementa. 
//Ukoliko takav indeks ne postoji, štampati -1. Na primjer, ako je dat niz a=[ 0, -3, 5, -4, -2, 3, 1, 0] indeksi koji ispunjavaju ovaj uslov su 0,3 i 7.

import java.util.Scanner;

public class Zad9 {
    public static int SumaElPrijeElementa(int a[], int e) {
        int zbir = 0;
        for (int i = 0; i < e; i++) {
            zbir += a[i];   //idi kroz petlju do tog nekog broja e i sabiraj sve brojeve koji su manji od tog e
        }
        return zbir;
    }

    public static int SumaElPosleElementa(int a[], int e) {
        int zbir = 0;
        for (int i = e + 1; i < a.length; i++) {
            zbir += a[i];   //idi kroz petlju do tog nekog broja e i sabiraj sve brojeve koji su veci od tog e
        }
        return zbir;
    }

    public static int[] pronadjiEl(int a[]) {
        //petlja mora da ide kroz svaki broj u nizu, i da ispituje da li je SumaElPrijeEl == SumaElPosleEl
        int cnt = 0;
        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if(SumaElPrijeElementa(a, i) == SumaElPosleElementa(a, i)) {
                b[cnt] = i;
                cnt++;
            }
        }
        
        int[] b2 = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            b2[i] = b[i];
        }

        return b2;
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
        int[] b = pronadjiEl(a);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}

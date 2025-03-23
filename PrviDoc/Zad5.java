//Napisati program koji od niza cijelih brojeva a formira nizove b i c, tako da su elementi niza b parni elementi niza a, a elementi niza c neparni elementi.
//1 2 3 4 5 6 7 8 9

import java.util.Scanner;

public class Zad5 {
    public static int[][] ParniINeparniElementi(int[] a) {
        int j = 0, k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                j++;
            }
            else {
                k++;
            }
        }

        int[] b = new int[j];
        int[] c = new int[k];
        int cnt1 = 0, cnt2 = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                b[cnt1++] = a[i];
            } else {
                c[cnt2++] = a[i];
            }
        }
        
        return new int[][] { b, c };
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

        int[][] rezultat = ParniINeparniElementi(a);
        
        for (int i = 0; i < rezultat.length; i++) {
            for (int j = 0; j < rezultat[i].length; j++) {
                System.out.print(rezultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package zadanie8;

import java.util.Scanner;

/**
 * Created by Kasia on 05.01.2017.
 */

public class Board {
    public static void main(String[] args) {
        Scanner userNumber = new Scanner(System.in);
        int[][] tab = new int[3][3];
        System.out.println("Tablica symetryczna " + tab.length + "x" + tab[0].length + ":");

        System.out.println("Podaj pierwszy rząd, złożony z trzech liczb:");
        tab[0][0] = userNumber.nextInt();
        tab[0][1] = userNumber.nextInt();
        tab[0][2] = userNumber.nextInt();
        System.out.print("  ");

        System.out.println("Podaj drugi rząd, złożony z trzech liczb:");
        tab[1][0] = userNumber.nextInt();
        tab[1][1] = userNumber.nextInt();
        tab[1][2] = userNumber.nextInt();
        System.out.print("  ");

        System.out.println("Podaj trzeci rząd, złożony z trzech liczb:");
        tab[2][0] = userNumber.nextInt();
        tab[2][1] = userNumber.nextInt();
        tab[2][2] = userNumber.nextInt();

        int sum0 = tab[0][0] + tab[0][1] + tab[0][2];
        int sum1 = tab[1][0] + tab[1][1] + tab[1][2];
        int sum2 = tab[2][0] + tab[2][1] + tab[2][2];

        System.out.println("Suma liczb w wierszu 1 to: " + sum0);
        System.out.println("Suma liczb w wierszu 2 to: " + sum1);
        System.out.println("Suma liczb w wierszu 3 to: " + sum2);


        if (sum0 > sum1 && sum0 > sum2) {
            System.out.println("Największa suma liczb jest w wierszu 1 i wynosi " + sum0 + ".");

        } else if (sum1 > sum0 && sum1 > sum2) {
            System.out.println("Największa suma liczb jest w wierszu 2 i wynosi " + sum1 + ".");

        } else if (sum2 > sum0 && sum2 > sum1) {
            System.out.println("Największa suma liczb jest w wierszu 3 i wynosi " + sum2 + ".");

        }
    userNumber.close();
    }
}



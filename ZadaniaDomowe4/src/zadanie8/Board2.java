package zadanie8;

import java.util.Scanner;

/**
 * Created by Kasia on 07.01.2017.
 */
public class Board2 {
    public static void main(String[] args) {
        Scanner userNumber = new Scanner(System.in);
        int[][] tab = new int[3][3];
        int[] sum = new int[3];// tablica do tworzenia sumy
        int i = 0; // kolumny
        int j = 0; // wiersze

        System.out.println("Tablica symetryczna " + tab.length + "x" + tab[0].length + ".");

        while (j < tab[i].length) {

            while (i < tab.length) {
                System.out.println("Podaj liczbę dla kolumny " + i + " w rzędzie " + j + ":");
                tab[i][j] = userNumber.nextInt();

                sum[j] = sum[j] + tab[i][j];
                i++;
            }
            System.out.println();
            System.out.println("suma w rzędzie: " + j + " wynosi : " + sum[j]);
            System.out.println();
            j++;
            i = 0;
        }
        System.out.println();

        if (sum[0] > sum[1] && sum[0] > sum[2]) {
            System.out.println("Największa suma liczb jest w wierszu 1 i wynosi " + sum[0] + ".");

        } else if (sum[1] > sum[0] && sum[1] > sum[2]) {
            System.out.println("Największa suma liczb jest w wierszu 2 i wynosi " + sum[1] + ".");

        } else if (sum[2] > sum[0] && sum[2] > sum[1]) {
            System.out.println("Największa suma liczb jest w wierszu 3 i wynosi " + sum[2] + ".");
        }
          else if (sum[0]==sum[1] && sum[1]==sum[2]) {
            System.out.println("Sumy wszystkich wierszy są równe.");

        }
        userNumber.close();
    }
}


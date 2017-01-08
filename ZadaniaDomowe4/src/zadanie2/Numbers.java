package zadanie2;

import java.util.Scanner;

/**
 * Created by Kasia on 05.01.2017.
 */
public class Numbers {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int[]number= new int[5];
        int i = 0;

        System.out.println("Utwórz tablicę 5 liczb całkowitych.");
        System.out.println( "Podaj swoje liczby: ");

        while(i < number.length) {
            number[i] = userinput.nextInt();
            i++;
        }

        int sum=number[0] + number[2] + number[4];
        System.out.println();
        System.out.println("Suma pierwszej, trzeciej i piątej liczby wynosi " + sum + ".");

        userinput.close();
    }
}

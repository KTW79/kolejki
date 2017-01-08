package zadanie4;

import java.util.Scanner;

/**
 * Created by Kasia on 07.01.2017.
 */
public class CoSys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj x:");
        int x = input.nextInt();
        System.out.println("Podaj y:");
        int y = input.nextInt();


        if (x > 0 && y > 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w I ćwiartce układu współrzędnych.");
        } else if (x < 0 && y > 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w II ćwiartce układu współrzędnych.");
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w III ćwiartce układu współrzędnych.");
        } else if (x > 0 && y < 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży w IV ćwiartce układu współrzędnych.");
        } else if (x == 0 && y == 0) {
            System.out.println("Punkt (" + x + "," + y + ") to początek układu współrzędnych.");
        }
        input.close();
    }
}

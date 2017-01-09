package zadanie1;

import java.util.Scanner;

/**
 * Created by Kasia on 05.01.2017.
 */
public class Names {
    public static void main(String[] args) {
       Scanner usernames = new Scanner(System.in);
        String[]name=new String[3];

        System.out.println("Wprowadź trzy dowolne imiona: ");
        name[0] = usernames.nextLine();
        name[1] = usernames.nextLine();
        name[2] = usernames.nextLine();
        System.out.println();
        System.out.println("Twoje imiona to: " + name[0]+", "+name[1]+" i "+name[2] + ".");

        usernames.close();
    }
}

package zadanie3;

import java.util.Scanner;

/**
 * Created by Kasia on 16.01.2017.
 */
public class WorlDirTest {
    public static void main(String[] args) {

        System.out.println("Dostępne kierunki geograficzne: ");
        WorldDir[]dir = new WorldDir[4];
        dir[0]=WorldDir.NORTH;
        dir[1]=WorldDir.SOUTH;
        dir[2]=WorldDir.EAST;
        dir[3]=WorldDir.WEST;

        for(int i=0;i<dir.length;i++){
            System.out.println(dir[i]);
        }

        System.out.println("Podaj kierunek geograficzny: ");
        Scanner userinput = new Scanner(System.in);
        WorldDir worlddir = WorldDir.valueOf(userinput.nextLine());

        switch (worlddir){
            case NORTH:
                System.out.println("Ok, idziemy na północ.");
                break;
            case SOUTH:
                System.out.println("Ok, idziemy na południe.");
                break;
            case EAST:
                System.out.println("Ojej, idziemy na wschód.");
                break;
            case WEST:
                System.out.println("A jednak, idziemy na zachód.");
                break;
            default:
                System.out.println("Nie ma takiego kierunku.");

    }
    userinput.close();
}
}

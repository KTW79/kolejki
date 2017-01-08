package zadanie7;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * Created by Kasia on 05.01.2017.
 */
public class InvertWelc {

    public static void main(String[] args) {
        Scanner usernames = new Scanner(System.in);
        String[]names = new String[5];
        System.out.println("Wprowadź 5 imion: ");
        names[0]=usernames.nextLine();
        names[1]=usernames.nextLine();
        names[2]=usernames.nextLine();
        names[3]=usernames.nextLine();
        names[4]=usernames.nextLine();
        usernames.close();

        int i = 5;
        while(i-- > 0){
            System.out.println("Witaj "+ names[i]);
        }
    }
}

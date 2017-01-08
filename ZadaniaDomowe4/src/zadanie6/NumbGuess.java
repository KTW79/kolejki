package zadanie6;

import java.util.Scanner;

/**
 * Created by Kasia on 07.01.2017.
 */
public class NumbGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int userguess = input.nextInt();

        int i = 0;

       while(i!=1){
            if(userguess<100){
                System.out.println("Liczba jest za mała"+input.nextLine());
                System.out.println("Podaj liczbę");
                userguess = input.nextInt();
            }else if(userguess>200){
                System.out.println("Liczba jest za duża"+input.nextLine());
                System.out.println("Podaj liczbę");
                userguess = input.nextInt();
            }else if(userguess%3==0){
                System.out.println(userguess);
                System.out.println("Twoja liczba jest ok");
                i=1;
            }else {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
                System.out.println("Podaj liczbę");
                userguess=input.nextInt();
            }

        }


    }
}

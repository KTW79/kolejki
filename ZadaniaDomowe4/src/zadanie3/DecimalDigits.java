package zadanie3;

/**
 * Created by Kasia on 07.01.2017.
 */
public class DecimalDigits {
    public static void main(String[] args) {

        System.out.println("Pętla while:");

       double i=0.0;
        while (i>=0 && i <= 3.1) {
            System.out.printf("\n%.1f",i);
            i=i+0.1;
        }
        System.out.println("\n");
        System.out.println("Pętla do while");

        i = 0.0;
        do {
            System.out.printf("\n%.1f",i);
            i=i+0.1;

        } while(i>=0 && i <= 3.1);

    }
}

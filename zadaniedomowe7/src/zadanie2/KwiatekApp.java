package zadanie2;

/**
 * Created by Kasia on 16.01.2017.
 */
public class KwiatekApp {
    public static void main(String[] args) {
        Kwiatek kwiatek1 = new Kwiatek(2,4,"Tulipan");
        Kwiatek kwiatek2 = new Kwiatek(4,8,"Irys");
        Kwiatek kwiatek3 = new Kwiatek(2,4,"Tulipan");

        System.out.println(kwiatek1);
        System.out.println(kwiatek2);
        System.out.println(kwiatek3);

        System.out.println("Kwiatek1 jest taki sam jak kwiatek2: " + kwiatek1.equals(kwiatek2));
        System.out.println("Kwiatek1 jest taki sam jak kwiatek3: " + kwiatek1.equals(kwiatek3));
        System.out.println("Kwiatek2 jest taki sam jak kwiatek3: " + kwiatek2.equals(kwiatek3));

    }
}

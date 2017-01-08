package zadanie5;

/**
 * Created by Kasia on 06.01.2017.
 */
public class SumNumb {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;
        while(i<=100){//wyświetl liczby od 0 do 100
            if(i%2==0){//jeśli  liczby są parzyste
                System.out.println(i);//wtedy je wyświetl
                sum=sum+i;
            }
            i++;//zwiększając o 1
        }
        System.out.println("Suma liczb parzystych wynosi "+ sum);
    }
}

package zadanie1;

/**
 * Created by Kasia on 16.01.2017.
 */
public class Square extends Shapes {

    public Square(double a) {
        super(a);
    }


    public double calculateArea(){
        double area = Math.pow(getA(),2);
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 4*getA();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Kwadrat o boku a = " + getA() + "\nPole kwadratu: " + calculateArea() +
                "\nObwód kwadratu: " + calculatePerimeter() + "\n";

    }
}


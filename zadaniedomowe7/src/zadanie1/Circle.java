package zadanie1;

/**
 * Created by Kasia on 16.01.2017.
 */
public class Circle extends Shapes {


    public Circle(double a) {
        super(a);
    }

    public double calculateArea(){
        double area = Math.PI*Math.pow(getA(),2);
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 2*Math.PI*getA();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Koło o promieniu r = " + getA() + "\nPole koła: " + calculateArea() + "\nObwód koła: " +
                calculatePerimeter() + "\n";
    }
}

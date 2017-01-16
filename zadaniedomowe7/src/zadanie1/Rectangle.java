package zadanie1;

/**
 * Created by Kasia on 16.01.2017.
 */
public class Rectangle extends Shapes {
    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double calculateArea(){
        double area = getA()*getB();
        return area;
    }

    public double calculatePerimieter(){
        double perimeter = (2*getA())+(2*getB());
        return perimeter;
    }


    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Prostokąt o bokach a = " + getA() + " i b = " + getB() + "\nPole prostokąta: " + calculateArea() +
                "\nObwód prostokąta: " + calculatePerimieter() + "\n";
    }
}

package zadanie1;

/**
 * Created by Kasia on 16.01.2017.
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shapes[] shape = new Shapes[3];
        shape[0] = new Circle(3);
        shape[1] = new Square(5);
        shape[2] = new Rectangle(4,8);


        Circle thiscircle = (Circle)shape[0];//rzutowanie, żeby dostać się do metod sprecyzowanych tylko dla klasy podrzędnej
        thiscircle.calculateArea();
        thiscircle.calculatePerimeter();

        Square thissquare = (Square)shape[1];
        thissquare.calculateArea();
        thissquare.calculatePerimeter();

        Rectangle thisrectangle = (Rectangle)shape[2];
        thisrectangle.calculateArea();
        thisrectangle.calculatePerimieter();



        for(int i=0;i<shape.length;i++){
            System.out.println(shape[i]);

        }

    }
}

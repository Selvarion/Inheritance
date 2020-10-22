import java.util.Scanner;

public class ObjectCreator {
    public static void main(String[] args) {

        System.out.println("Welcome to area calculator");

        Scanner input = new Scanner(System.in);

        while (!input.hasNextDouble()){
            input.nextDouble();
        }

        double firstScan = input.nextDouble();
        double secondScan = input.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(firstScan);
        rectangle.setSideB(secondScan);
        rectangle.countArea();

        Triangle triangle = new Triangle();
        triangle.setSideA(firstScan);
        triangle.setHeight(secondScan);
        triangle.countArea();

        Circle circle = new Circle();
        circle.setRadius(firstScan);
        circle.countArea();




    }
}

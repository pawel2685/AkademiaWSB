package wsb.pl;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 4,3);

        double a = triangle.getA();
        double b = triangle.getB();
        double h = triangle.getH();

        boolean confirmResult = triangle.confirmTriangle(a, b, h);

        if (confirmResult) {

            System.out.println("Triangle area is: " + triangle.calculateArea(a, b, h));

        } else {

            System.out.println("Impossible to create triangle!");
        }

    }
}
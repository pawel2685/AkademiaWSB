package wsb.pl;

public class Triangle {

    // dane
    private double a;
    private double b;
    private double h;

    public Triangle(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    // Potwierdź mozliwy trójkąt
    public boolean confirmTriangle(double a, double b, double h) {

        boolean side1 = checkValues(this.a, this.b, this.h);
        boolean side2 = checkValues(this.a, this.h, this.b);
        boolean side3 = checkValues(this.b, this.h, this.a);


        if (side1 && side2 && side3) {
            return true;
        } else {
            return false;
        }
    }

    // Sprawdź wariant dla długości odcinków
    private boolean checkValues(double val1, double val2, double val3) {
        return val1 + val2 > val3;
    }

    // Oblicz pole trójkąta używając 3 podanych dlugości
    public double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt( p * (p-a) * (p-b) * (p-c) );
    }
}

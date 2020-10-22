public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    public Rectangle() {
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    void countArea() {
        System.out.println("Area of rectangle " + sideA * sideB);
    }
}

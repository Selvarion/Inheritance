public class Circle extends Figure {

    private double radius;
    final double PI = 3.14;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void countArea() {
        System.out.println("Area of cricle " + PI * radius * radius);
    }

}

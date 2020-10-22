public class Triangle extends Figure {

    private double sideA;
    private double height;

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", height=" + height +
                '}';
    }


    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    void countArea() {
        System.out.println("Area of triangle " + 0.5 * height * sideA);
    }


}

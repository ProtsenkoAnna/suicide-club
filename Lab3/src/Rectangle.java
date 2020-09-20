public class Rectangle extends Shape{

    protected double width, length;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.length = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.length = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLenght(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length *width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length +width);
    }

    @Override
    public String toString() {
        return null;
    }
}

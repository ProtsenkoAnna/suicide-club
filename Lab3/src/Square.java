public class Square extends Rectangle {

    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    public void setWidth(double side){

    }
    public void setLength(double side){

    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
public class Square extends Rectangle{
    protected double side;

    public Square() {
    }

    public Square(double length, double width, String color, boolean filled, double side) {
        super(length, width, color, filled);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    public String toString() {
        return "Shape: square, side: "+this.side+", color: "+this.color;
    }
}

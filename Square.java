package inheritance_assignment;

public class Square extends Rectangle {

    Square() {
        super();
    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    double getSide() {
        return getLength();
    }

    void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    void setWidth(double side) {
        super.setWidth(side);
    }

    void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return getColor() + " " + isFilled() + " " + getWidth() + " " + getLength();
    }

}

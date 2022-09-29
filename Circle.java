package inheritance_assignment;

class Circle extends Shape {

    private double radius;

     Circle(){
         super();
     }
    
    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * (radius * radius);
    }

    double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return getColor() + " " + isFilled() + " " + radius;
    }
}

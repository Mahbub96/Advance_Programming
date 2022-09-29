package inheritance_assignment;

public class Rectangle extends Shape{
    private double width;
    private double length;

    Rectangle(){
        super();
        width = 1;
        length = 1;
    }
    Rectangle(double width,double length){
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    double getWidth(){
        return width;
    }
    void setWidth(double width){
        this.width = width;
    }

    double getLength(){
        return length;
    }

    void setLength(double length){
        this.length = length;
    }

    double area(){
        return width*length;
    }

    double getPerimeter(){
	return 2*length+2*width;
	
    }
    @Override
    public String toString(){
        return getColor()+" "+isFilled()+" "+width+" "+length;
    }

    
}

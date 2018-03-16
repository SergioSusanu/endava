package Circle;

public class Circle {
    private int radius=0;

    public Circle(int radius) {
        if(radius > 0)
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter(){
        return Math.PI * 2 * getRadius();
    }
}

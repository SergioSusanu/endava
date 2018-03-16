package GraphicObject;

public class Circle extends GraphicObject {
    private int radius=0;

    public Circle(int radius) {
        if(radius > 0)
            this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

}

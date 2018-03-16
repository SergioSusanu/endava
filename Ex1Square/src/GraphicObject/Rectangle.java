package GraphicObject;

public class Rectangle extends GraphicObject {
    private int lengthX =0;
    private int lengthY =0;

    public Rectangle(int lengthX, int lengthY) {
        this.lengthX = lengthX;
        this.lengthY = lengthY;
    }

    private int getLengthX() {
        return lengthX;
    }

    private int getLengthY() {
        return lengthY;
    }

    @Override
    public double area() {
        return getLengthX()*getLengthY();
    }
}

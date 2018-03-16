package GraphicObject;

public class UseGraphicObject {

    public static void main (String[] args){

        Circle cerc= new Circle(10);
        System.out.println(cerc.area());

        Rectangle rectangle= new Rectangle(10,5);
        System.out.println(rectangle.area());
    }
}

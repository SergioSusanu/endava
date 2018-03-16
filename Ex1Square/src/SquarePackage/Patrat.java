package SquarePackage;

public class Patrat {
    private int sideLength=0;

    public Patrat(int sideLength) {
        if (sideLength>0)
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public int calculateArea(){
        return getSideLength()*getSideLength();
    }

    public int calculatePerimeter(){
        return getSideLength()*4;
    }
}

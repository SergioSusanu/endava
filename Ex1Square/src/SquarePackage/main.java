package SquarePackage;

import Circle.Circle;
import Student.Student;

import java.sql.SQLOutput;

public class main {

    public static void main(String[] args) {

        Patrat myPatrat= new Patrat(5);
        System.out.println(myPatrat.calculateArea());
        System.out.println(myPatrat.calculatePerimeter());

        Circle myCircle= new Circle(10);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getPerimeter());

        Student Vasea = new Student();
        Vasea.setData("Vasea", 20);

        Student Feghea = new Student();
        Feghea.setData("Feghea",30);

        System.out.println(Vasea.getAge());
        System.out.println(Feghea.getAge());

        System.out.println("Average age: " + (Vasea.getAge() + Feghea.getAge())/2);
    }
}

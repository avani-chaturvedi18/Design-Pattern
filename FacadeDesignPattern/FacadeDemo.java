package FacadeDesignPattern;

import java.util.Scanner;
interface Shape {
    public void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square...");
    }
}

class ShapeMaker {
    Scanner sc = new Scanner(System.in);
    Circle c = new Circle();
    Square s = new Square();
    Rectangle r = new Rectangle();
    public void drawShape() {
        System.out.println("Enter the shape you want to draw: ");
        String shapeName = sc.next();
        while(true) {
            switch(shapeName) {
                case "circle":
                    c.draw();
                    break;
                case "square":
                    s.draw();
                    break;
                case "rectangle":
                    r.draw();
                    break;
                default:
                    System.out.println("INVALID CHOICE!");
                    break;
            }
            break;
        }
    }
}

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker sm = new ShapeMaker();
        sm.drawShape();
    }
}

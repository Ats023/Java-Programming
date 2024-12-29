//Java Program to add three different types of shapes (Circle, Rectangle, Triangle) to an array of shapes.
import java.util.*;
class Shape { //superclass
    float area=0;
    void calcArea() {
        System.out.println("Superclass method");
    }
    void printShape() {
        System.out.println("Print Shape Type");
    }
}

class Circle extends Shape {
    int r;
    Circle(int radius) {
        r=radius;
    }
    void calcArea() {
        super.area = (float)3.14*r*r;
        System.out.println("Circle Area:"+super.area);
    }
    void printShape() {
        System.out.println("Circle("+r+")");
    }
}

class Rectangle extends Shape {
    int l,b;
    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    void calcArea() {
        super.area = (float)l*b;
        System.out.println("Rectangle Area:"+super.area);
    }
    void printShape() {
        System.out.println("Rectangle("+l+","+b+")");
    }
}

public class ShapeDemo {
    public static void main(String args[]) {
        int n=0, i=0;
        Shape arr[] = new Shape[10];
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            Shape obj;
            int shapeType; 
            shapeType = sc.nextInt();
            switch(shapeType) {
                case 1: System.out.println("Circle Selected!");
                obj = new Circle(sc.nextInt());
                obj.calcArea();
                break;

                case 2: System.out.println("Rectangle Selected!");
                obj = new Rectangle(sc.nextInt(), sc.nextInt());
                obj.calcArea();
                break;

                default: System.out.println("Type not recognized.");
                obj=null;
                break;
            }
            if(obj!=null) arr[i++] = obj;
            n++;
        }
        sc.close();
        
        for(int j=0; j<n; j++) {
            arr[j].printShape();
        }
        
    }
}



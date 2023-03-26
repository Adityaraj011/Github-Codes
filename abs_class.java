import java.util.*;
import java.util.Scanner;

abstract class Figure {
  int length, breadth;

  abstract void area(int a, int b);
}

class Triangle extends Figure {

  void area(int a, int b) 
  {
    System.out.println("area of triangle = " + (a * b) / 2);
  }
}

class Rectangle extends Figure
 {
  void area(int a, int b) 
  {
    System.out.println("area of rectangle = " + a * b);
  }
}

public class abs_class 
{
  public static void main(String arg[]) {
    System.out.println("Enter the value a and b = ");
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    Figure obj;

    Triangle t = new Triangle();
    Rectangle r = new Rectangle();

    obj = t;
    obj.area(a, b);
    obj = r;
    obj.area(a, b);

  }
}
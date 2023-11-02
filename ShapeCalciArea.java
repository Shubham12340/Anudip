package abstractandintrefacepack;

abstract class Shape
{
  
  protected final double pi = 3.14;

  
  abstract double calculateArea();
}

//Created a Class Circle extends Shape
class Circle extends Shape
{
  private double radius;

  // Created Constructor for Circle class
  public Circle(double radius) 
  {
      super(); // Call the constructor of the parent abstract class
      this.radius = radius;
  }

  @Override
  double calculateArea() 
  {
      System.out.println("Area of Circle: " + pi * radius * radius);
      return 0;
  }   
}

class Rectangle extends Shape
{
  private double length;
  private double breath;

  public Rectangle(double length, double breath) 
  {
      super(); 
      this.length = length;
      this.breath = breath;
  }

  @Override
  double calculateArea() 
  {
      System.out.println("Area of Rectangle: " + length * breath);
      return 0;
  }
}

public class ShapeCalciArea 
{
  public static void main(String[] args) 
  {      
      Circle cr = new Circle(6);
      cr.calculateArea();
      Rectangle robj = new Rectangle(6, 8);
      
      robj.calculateArea();
  }
}
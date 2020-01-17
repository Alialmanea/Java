package open.closed.principle;

 interface Shape{
   abstract double  calculateArea();
}


 
 class Rectangle implements Shape{
  double length;
  double width;
  public double calculateArea(){
    return length * width;
  }
}
 
 class Circle implements Shape{
  public double radius;
  public double calculateArea(){
    return (22/7)*radius*radius;
  }
}

 class AreaCalculator{
   double calculateShapeArea(Shape shape){
    return shape.calculateArea();
  }
}

public class OpenClosedPrinciple {

    
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=30;
        Rectangle r1=new Rectangle();
        r1.length=20;
        r1.width=40;
        AreaCalculator area=new AreaCalculator();
        System.out.println(area.calculateShapeArea(c1));
        
        
    }
    
}

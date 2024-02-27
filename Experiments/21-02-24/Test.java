abstract class Shape
{
   double area,perimeter;
   abstract void CalcArea();
   abstract void CalcPerimeter(); 
}
class Trianlge extends Shape
{
 int l,h,a,b,c;
  Trianlge(int l,int h,int a,int b,int c)
 {
    this.l=l;
    this.h=h;
    this.a=a;
    this.b=b;
    this.c=c;
 }
 void CalcArea()
 {
    area=0.5*(b*h);
    System.out.println("Area of traingle is: "+area);
 }
 void CalcPerimeter()
 {
  perimeter=a+b+c;
  System.out.println("Perimeter of traingle is: "+perimeter);
 }
}

class Rectangle extends Shape
{
 int l,w;
 Rectangle(int l,int w)
 {
    this.l=l;
    this.w=w;
 }
 void CalcArea()
 {
    area=l*w;
    System.out.println("Area of Rectangle is: "+area);
 }
 void CalcPerimeter()
 {
    perimeter=2*(l+w);
    System.out.println("Perimeter of Rectangle is: "+perimeter);
 }
}

class Square extends Shape
{
 int s;
 Square(int s)
 {
    this.s=s;
 }
 void CalcArea()
 {
    area=s*s;
    System.out.println("Area of Square is: "+area);
 }
 void CalcPerimeter()
 {
    perimeter=4*s;
    System.out.println("Perimeter of Square is: "+perimeter);
 }
}


class Circle extends Shape
{
 float r;
 Circle(float r)
 {
   this.r=r;
 }
 void CalcArea()
 {
    area=3.14*r*r;
    System.out.println("Area of Circle is: "+area);
 }
 void CalcPerimeter()
 {
    perimeter=2*3.14*r;
    System.out.println("Perimeter of Circle is: "+perimeter);
 }
}

class Cube extends Shape
{
 int a;
 Cube(int a)
 {
    this.a=a;
 }
 void CalcArea()
 {
    area=6*a*a;
    System.out.println("Area of Cube is  is: "+area);
 }
 void CalcPerimeter()
 {
    perimeter=12*a;
    System.out.println("Perimeter of Cube is: "+perimeter);
 }
}

public class Test
{
    public static void main(String[] args)
    {
    Trianlge T=new Trianlge(10,20,30,40,50);
    T.CalcArea();
    T.CalcPerimeter();

    Rectangle R=new Rectangle(10,20);
    R.CalcArea();
    R.CalcPerimeter();

    Square S=new Square(10);
    S.CalcArea();
    S.CalcPerimeter();

    Cube C=new Cube(10);
    C.CalcArea();
    C.CalcPerimeter();

    Circle Cr=new Circle(10);
    Cr.CalcArea();
    Cr.CalcPerimeter();
    }
}
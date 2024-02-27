abstract class Shape
{
   double area,perimeter;
   abstract void CalcArea();
   abstract void CalcPerimeter(); 
   void display()
   {
      System.out.println("Area: "+area);
      System.out.println("Perimeter: "+perimeter);
   }
}
class Triangle extends Shape
{
 int l,h,a,b,c;
  Triangle(int l,int h,int a,int b,int c)
 {
    this.l=l;
    this.h=h;
    this.a=a;
    this.b=b;
    this.c=c;
    System.out.println("For Triangle");
 }
 void CalcArea()
 {
    area=0.5*(b*h);
 }
 void CalcPerimeter()
 {
  perimeter=a+b+c;
 }
}

class Rectangle extends Shape
{
 int l,w;
 Rectangle(int l,int w)
 {
    this.l=l;
    this.w=w;
    System.out.println("For Rectangle");
 }
 void CalcArea()
 {
    area=l*w;
 }
 void CalcPerimeter()
 {
    perimeter=2*(l+w);
 }
}

class Square extends Shape
{
 int s;
 Square(int s)
 {
    this.s=s;
    System.out.println("For Square");
 }
 void CalcArea()
 {
    area=s*s;
 }
 void CalcPerimeter()
 {
    perimeter=4*s;
 }
}


class Circle extends Shape
{
 float r;
 Circle(float r)
 {
   this.r=r;
   System.out.println("For Circle");
 }
 void CalcArea()
 {
    area=3.14*r*r;
 }
 void CalcPerimeter()
 {
    perimeter=2*3.14*r;
 }
}

class Cube extends Shape
{
 int a;
 Cube(int a)
 {
    this.a=a;
    System.out.println("For Cube");
 }
 void CalcArea()
 {
    area=6*a*a;
 }
 void CalcPerimeter()
 {
    perimeter=12*a;
 }
}

public class Test
{
    public static void main(String[] args)
    {
    Shape T=new Triangle(10,20,30,40,50);
    T.CalcArea();
    T.CalcPerimeter();
    T.display();

    Shape R=new Rectangle(10,20);
    R.CalcArea();
    R.CalcPerimeter();
    R.display();

    Shape S=new Square(10);
    S.CalcArea();
    S.CalcPerimeter();
    S.display();

    Shape C=new Cube(10);
    C.CalcArea();
    C.CalcPerimeter();
    C.display();

    Shape Cr=new Circle(10);
    Cr.CalcArea();
    Cr.CalcPerimeter();
    Cr.display();
    }
}

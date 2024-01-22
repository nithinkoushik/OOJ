import java.util.Scanner;
abstract class shape
{
    double dim1,dim2,dim3;
    shape(double a,double b,double c)
    {
        dim1=a;
        dim2=b;
        dim3=c;
    }
    shape(double r)
    {
        dim1=r;
    }
    abstract void area();
    abstract void perimeter();
}
class triangle extends shape
{
    triangle(double a,double b,double c)
    {
        super(a,b,c);
    }
    void area()
    {
        System.out.println("the area of triangle :"+(0.5*dim1*dim2));
    }
    void perimeter()
    {
                System.out.println("the perimeter of triangle :"+(dim1+dim2+dim3));
    }
}
class circle extends shape
{
    circle(double a)
    {
        super(a);
    }
     void area()
    {
        System.out.println("the area of circle :"+(3.14*dim1*dim1));
    }
    void perimeter()
    {
                System.out.println("the perimeter of circle :"+(2*3.14*dim1));
    }
    
}
class Main 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        double a,b,c;double r;
        System.out.println("enter three sides of a triangle");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        triangle ob1=new triangle(a,b,c);
        ob1.area();
        ob1.perimeter();
        System.out.println("enter radius of circle");
        r=in.nextDouble();
        circle ob2=new circle(r);
        ob2.area();
        ob2.perimeter();
    }
}

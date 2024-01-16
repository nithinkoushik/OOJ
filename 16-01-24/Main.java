import java.util.Scanner;
class Box {
double width;
double height;
double depth;
Box(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
public String toString() {
return "Dimensions are " + width + " by " +
depth + " by " + height + ".";
}
}
class Main{
public static void main(String args[])
{
Box b=new Box(10,20,30);
String s="box:"+b;
System.out.println(b);
System.out.println(s);
}
}
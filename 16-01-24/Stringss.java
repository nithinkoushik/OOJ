import java.util.Scanner;
class Stringss
{
public static void main(String args[])
{
char charss[]={'a','b','c'};
String s=new String(charss);
String s1=new String(s);
System.out.println(s);
System.out.println(s1);
byte ascii[] = {65, 66, 67, 68, 69, 70 };
String ascii1 = new String(ascii);
System.out.println(ascii1);
String ascii2 = new String(ascii, 2, 3);
System.out.println(ascii2);
}}
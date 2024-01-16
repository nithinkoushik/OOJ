import java.util.Scanner;
class Ma
{
public static void main(String args[])
{
String str="Welcome to Bmsce College";
int start=11;
int end=16;
char buf[]=new char[end-start];
str.getChars(11,16,buf,0);
System.out.println(buf);
}
}
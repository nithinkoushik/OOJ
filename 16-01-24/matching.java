import java.util.Scanner;
class matching
{
public static void main(String args[])
{
String str1="Welcome to Bmsce College of Engineering";
String otherstr="Bmsce College";
Boolean
ismatch=str1.regionMatches(11,otherstr,0,13);
if(ismatch)
System.out.println("substring is matched");
else
System.out.println("substring is not matched");
}
}
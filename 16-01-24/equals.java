class equals
{
public static void main(String args[])
{
String s1="Bmsce";
String s2="BMSCE";
String s3="College";
System.out.println(s1 +"equals"+s2+"->"+s1.equals(s2));
System.out.println(s1 +"equals"+s3+"->"+s1.equals(s3));
System.out.println(s1 +"equals"+s2+"->"+s1.equalsIgnoreCase(s2));
}
}

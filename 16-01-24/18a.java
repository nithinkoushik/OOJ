class Main {
public static void main(String args[]) {
String s;
int a = 42;
StringBuffer sb = new StringBuffer(40);
s = sb.append("a = ").append(a).append("!").toString();
System.out.println(s);
StringBuffer sb1 = new StringBuffer("I Java!");

sb1.insert(2, "like ");

System.out.println(sb1);
System.out.println(sb1.reverse());
StringBuffer sb2 = new StringBuffer("This is a test.");

sb2.delete(4, 7);

System.out.println("After delete: " + sb2);

sb2.deleteCharAt(0);

System.out.println("After deleteCharAt: " + sb2);
StringBuffer sb3 = new StringBuffer("This is a test.");

sb3.replace(5, 7, "was");

System.out.println("After replace: " + sb3);
}
}

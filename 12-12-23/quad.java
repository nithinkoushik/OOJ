import java.util.Scanner;

class quad {
    public static void main(String args[]) {
        int a, b, c;
        double r1, r2, d;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the co-ordinate a");
        a = in.nextInt();
        System.out.println("enter the co-ordinate b");
        b = in.nextInt();
        System.out.println("enter the co-ordinate c");
        c = in.nextInt();
        while (a == 0) {
            System.out.println("Not a quadratic equation");
            System.out.println("Enter a non zero value for a");
            Scanner s = new Scanner(System.in);
            a = in.nextInt();
        }
        d = (b * b) - (4 * a * c);
        if (d == 0) {
            r1 = (-b) / (2 * a);
            System.out.println("roots are real and equal");
            System.out.println("root1=" + r1 + "root2=" + r1);
        } else if (d > 0) {
            r1 = ((-b) + (Math.sqrt((d))) / (double) (2 * a));
            r2 = ((-b) - (Math.sqrt((d))) / (double) (2 * a));
            System.out.println("Roots are real and distinct");
            System.out.println("Root1 =" + r1 + "Root2 = " + r2);
        } else {
            System.out.println("Roots are imaginery");
            r1 = (-b) / (2 * a);
            r2 = Math.sqrt((-d)) / (2 * a);
            System.out.println("root1=" + r1 + "+i" + r2);
            System.out.println("root1=" + r1 + "-i" + r2);
        }
    }
}

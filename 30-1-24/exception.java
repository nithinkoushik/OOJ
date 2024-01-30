import java.util.Scanner;
class wrongAge extends Exception
{
    wrongAge()
    {
       super("ENTER CORRECT AGE!");
    }
    wrongAge(String message)
    {
         super(message);
    }
}
class father 
{
     int fage;
    Scanner in=new Scanner(System.in);
    father() throws wrongAge
    {
        System.out.println("ENTER FATHER'S AGE");
       fage=in.nextInt();
        if(fage<0)
        {
           throw new wrongAge("AGE CANNOT BE NEGATIVE");
        }
    }
    public void display1()
    {
        System.out.println("FATHER'S AGE:"+fage);
    }
}
class son extends father
{
     int sage;
     Scanner in=new Scanner(System.in);
     son() throws wrongAge
     {
         System.out.println("ENTER SON'S AGE");
         sage=in.nextInt();
         if(sage>=super.fage)
         {
             throw new wrongAge("SON'S AGE CANNOT BE GREATER THAN FATHER'S AGE");
         }
         else if(sage<0)
         {
             throw new wrongAge("AGE CANNOT BE NEGATIVE");
         }
     }
     public void display()
     {
         System.out.println("SON'S AGE:"+sage);
     }
}
class Main
{
    public static void main(String args[])
    {
        try {
           son obj=new son();
           obj.display1();
           obj.display();
           
        } catch(wrongAge e) {
            System.out.println("EXCEPTION:"+e.getMessage());
        }
    }
}

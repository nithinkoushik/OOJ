abstract class bird
{
    abstract void fly();
    abstract void makesound();
}
class eagle extends bird
{
    void fly()
    {
        System.out.println("EAGLE CAN FLY!");
    }
    void makesound()
    {
          System.out.println("EAGLE makes MEOWW");
    }
}
class hawk extends bird
{
    void fly()
    {
      System.out.println("HAWK CAN FLY!");
    }
    void makesound()
    {
          System.out.println("HAWK MAKES BOWW");
    }
}
class Main 
{
    public static void main(String args[])
    {
        hawk ob1=new hawk();
        eagle ob2=new eagle();
        ob1.fly();
        ob1.makesound();
        ob2.fly();
        ob2.makesound();
        
    }
}

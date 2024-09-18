
class parent 
{
   void print()
   {
    System.out.println("This Is Parent Class");
   }
}
class child extends parent
{
    void printl()
    {
     System.out.println("This Is Child Class");
    }
}
public class pract_17 
{
    public static void main(String[] args) 
    {
        parent obj = new parent();
        child obj1 = new child();
        obj1.print();

    }
}
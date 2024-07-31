import java.util.*;

public class prac_13
{ 
}
 class employee
{
    Scanner s = new Scanner(System.in);
    String fname,lname;
    double sallary;
    
    public String fs(String f)
    {
       return fname=f;
    }

    public String setfs(){

        return fname;
    }
    public String ls(String ln)
    {
       return lname=ln;
    }
    public String setln()
    {

        return lname;
    }
    public double sallary(double sal)
    {
        if(sal<=0)
        {
            return sallary=0;
        }
        return sallary=sal;
    }
    public double setsall()
    {
        return sallary;
    }
} 
class maain
{
   public static void main(String[] args) 
   {
       employee objemp = new employee();
       employee objemp1 = new employee();
       String fname,lname;
       double sallary;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter your first name :");
       fname=s.nextLine();
       System.out.println("Enter your last name :");
       lname=s.nextLine();
       System.out.println("Enter your sallary :");
       sallary=s.nextDouble();
       objemp.fs(fname);
       objemp.ls(lname);
       objemp.sallary(sallary);
       System.out.println("First name is :"+objemp.setfs());
       System.out.println("last name is :"+objemp.setln());
       System.out.println("sallary name is :"+objemp.setsall());
       System.out.println("Enter your first name :");
       fname=s.nextLine();
       System.out.println("Enter your last name :");
       lname=s.nextLine();
       System.out.println("Enter your sallary :");
       sallary=s.nextDouble();
       objemp1.fs(fname);
       objemp1.ls(lname);
       objemp1.sallary(sallary);  
       System.out.println("First name is :"+objemp1.setfs());
       System.out.println("First name is :"+objemp1.setln());
       System.out.println("First name is :"+objemp1.setsall());
   }
}
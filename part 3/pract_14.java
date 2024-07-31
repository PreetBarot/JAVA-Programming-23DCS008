import java.util.*;
public class pract_14
{

}
class getda
{
    int DAY,MONTH,YEAR;
    int getday(int day)
    {
        return DAY=day;
    }
    int putday()
    {
        return DAY;
    }
    int getmonth(int month)
    {
        return MONTH=month;
    }
    int putmonth()
    {
        return MONTH;
    }
    int getyear(int year)
    {
        return YEAR=year;
    }
    int putyear()
    {
        return YEAR;
    }
}
class call
{  
    public static void main(String[] args) 
    {
        getda obj = new getda();
        int Day,Year,Month;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter day :");
    Day=s.nextInt();
    System.out.println("Enter Month :");
    Month=s.nextInt();
    System.out.println("Enter Year:");
    Year=s.nextInt();
    obj.getday(Day);
    obj.getmonth(Month);
    obj.getyear(Year);
    System.out.println(obj.putday()+"/"+obj.putmonth()+"/"+obj.putyear());
    }
    
}

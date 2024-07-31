import java.util.*;
public class prac_15
{
    
}
class Area
{
    int Length;
    int Breath,ans;
    Area()
    {
         Length=0;
         Breath=0;
    }
    Area(int length,int breath)
    {
        Length=length;
        Breath=breath;
    }
    int cal()
    {
        return ans=Length*Breath;
    }
}
class que
{
    public static void main(String[] args) 
    {
        // Area obj = new Area();
        Scanner s = new Scanner(System.in);
        int length,breath;
        System.out.println("Enter the Length :");
        length=s.nextInt();
        System.out.println("Enter the Breath :");
        breath=s.nextInt();
        Area obj = new Area(length, breath);
        System.out.println("Area is :"+obj.cal());
    }
}
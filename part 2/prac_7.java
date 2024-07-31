import java.util.*;
public class prac_7 {
    
    public static void main(String[] args)
    {
       
        String s1;
        Scanner s=new Scanner (System.in);
        System.out.println("enter the String:");
        s1=s.nextLine();
        front_time(s1);
  
    }
    public static void front_time(String arr)
        {
            String s2=arr.substring(0,3);
            for(int i=0;i<3;i++)
            {
                 System.out.print(s2);
            }
            
        }
        
}

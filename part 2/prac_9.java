import java.util.*;
public class prac_9 {
    public static void main(String ,args[])
    {
        Scanner s=new Scanner(System.in);
        String s1;
        System.out.println("Enter The String :");
        s1=s.nextLine();
        doub_char(s1);
        
    }
    public static void doub_char(String s2)
    {
        
        String s;
        for(int i=0;i<s.length();i++)
        {
            s=s2.charAt(i)+s2.charAt(i);
        }
        System.out.println(s);
    }
    
}

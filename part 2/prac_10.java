import java.util.*;
public class prac_10 
{
    public static void main(String[] args)
    {
        String name="PrEet";
        char revname;
        System.out.println("Length of the string :"+ name.length());
        System.out.println("Lowercase of the string :"+ name.toLowerCase());
        System.out.println("Lowercase of the string :"+ name.toUpperCase());
        for(int i=name.length()-1;i>=0;i--)
        {
            revname=name.charAt(i);
            System.out.print(revname);
        }  
        System.out.println("Now the String is"+"CHARUSAT");
       
    }
    
}

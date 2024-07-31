import java.util.*;
public class prc_11 
{
    public static void main(String[] args) 
    {
        
        Scanner s =new Scanner(System.in);
        String name;
       
        System.out.println("Enter the string:");
        name=s.nextLine();
        char arr[] = name.toCharArray();
        char c;
        for(int i=0;i<name.length()-2;i++)
        {
            int count=0;
            
            for(int j=1;j<=name.length()-1;j++)
            {
               if(arr[i]==arr[j])
               {
                  c=arr[i];
                  System.out.println(c);
                  count++;
               }

            }  
            System.out.println(count + " character repeated");
   
        }
        
        
    }
}

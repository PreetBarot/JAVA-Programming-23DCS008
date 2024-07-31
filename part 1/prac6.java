import java.util.*;
public class practise {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n,first=0,second=1,temp,sum=0;
        System.out.println("Enter the number :");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                System.out.print(first+" ");
                sum=sum+first;
                continue;
                
            }
            if(i==2)
            {
                System.out.print(second+" ");
                sum=sum+second;
                continue;
            
            }
            temp=first+second;
            first=second;
            second=temp;
            System.out.print(temp+" ");
            sum=sum+temp;
        }
        System.out.println();
        System.out.println("Sum is :"+sum);



        
    }
    
}

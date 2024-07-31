import java.util.*;
public class prac_4 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size,sum=0;
        System.out.println("enter number of days :");
        size=s.nextInt();
        int arr[]=new int[size];
        for(int i=1;i<=size;i++)
        {
            System.out.println("enter "+i+"day :");
            arr[i]=s.nextInt();
        }
        for(int i=1;i<=size;i++)
        {
            sum=sum+arr[i];
        }

        System.out.println("total expense is "+sum);

    }
}

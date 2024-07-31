import java.util.*;
public class pract_8 {
    public static void main(String[] args)
    {
        Scanner s= new Scanner (System.in);
        int n;
        System.out.println("\n");
        System.out.println("enter the size");
        n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int no;
        no=array_count(arr,n);
        System.out.println(no + " time 9 is there in the aray");
    }
    public static int array_count(int arra[],int a)
        {
            int count=0;
            for(int i=0;i<a;i++)
            {
                if(arra[i]==9)
                {
                    count++;
                }
            }
            return count;
        }

    
    
}

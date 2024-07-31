import java.util.*;

public class pract5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Number of products you want to buy:");
        int n = s.nextInt();

        float[] motor = new float[n];
        float[] fan = new float[n];
        float[] tube = new float[n];
        float[] wire = new float[n];
        float sum = 0;

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter product code for product " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                motor[i] = 100 * 0.08f + 100;
                sum += motor[i];
            }
            if (arr[i] == 2) {
                fan[i] = 100 * 0.12f + 100;
                sum += fan[i];
            }
            if (arr[i] == 3) {
                tube[i] = 100 * 0.05f + 100;
                sum += tube[i];
            }
            if (arr[i] == 4) {
                wire[i] = 100 * 0.075f + 100;
                sum += wire[i];
            }
        }

        System.out.println("Total expense is " + sum);
    }
}

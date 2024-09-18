import java.util.Scanner;



class Preet extends Thread {
    int start, end;
    static int sum = 0;

    Preet(int start, int end) {
        this.start = start;
        this.end = end;
    }
    static void total_sum(int partialSum)
    {
       sum+=partialSum;
    }
    public void run()
    {
        int partialSum = 0;
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
        total_sum(partialSum);
    }
}


public class practice_preet {
    public static void main(String[] args) {
        int num_threads, num_numbers;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Numbers of Threads");
        num_threads = s.nextInt();
        System.out.println("Enter number's of sum:");
        num_numbers = s.nextInt();

        Preet[] threads = new Preet[num_threads];

        int range = num_numbers / num_threads;
        int start = 1, end;
        
        for (int i = 0; i < num_threads; i++) {
            end = (i == num_threads - 1) ? num_numbers : start + range - 1;
            threads[i] = new Preet(start, end);
            start = end+1;
        }
        try {
            for (int i = 0; i < num_threads; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("The sum of numbers from 1 to " + num_numbers + " is: " + Preet.sum);
    }

}
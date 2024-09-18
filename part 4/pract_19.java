import java.util.*;

public class pract_19 {

}

class rectangle {
    public int length, breath;
    float area;

    rectangle() {
        length = 0;
        breath = 0;
    }

    rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    float area() {
        return length * breath;
    }

    float perimeter() {
        return 2 * (length + breath);
    }
}

class square extends rectangle {
    square(int s) {
        super(s, s);
    }
}

class enter_data {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of required area of rectangle : ");
        int a, b;
        a = s.nextInt();
        System.out.println("Enter number of required area of square : ");
        b = s.nextInt();
        int length;
        int breath;
        int side;

        // rectangle[] rec;
        // rec = new rectangle[a];

        rectangle[] rec = new rectangle[a];
        square[] sqr = new square[b];

        for (int i = 0; i < a; i++) {
            System.out.println("Enter length of " + (i + 1) + " Rectangle");
            length = s.nextInt();
            System.out.println("Enter breath of " + (i + 1) + " Rectangle");
            breath = s.nextInt();
            rec[i] = new rectangle(length, breath);
            System.out.println("Area of " + (i + 1) + " rectangle :" + rec[i].area());
            System.out.println("Perimeter of " + (i + 1) + " rectangle :" + rec[i].perimeter());
        }
        for (int i = 0; i < b; i++) {
            System.out.println("Enter length of " + (i + 1) + " Square");
            side = s.nextInt();
            sqr[i] = new square(side);
            System.out.println("Area of " + (i + 1) + " Square :" + sqr[i].area());

        }
    }
}

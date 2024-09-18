// Define the base class Degree
class Degree {
    // Method to print "I got a degree"
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

// Define the Undergraduate class inheriting from Degree
class Undergraduate extends Degree {
    // Method to print "I am an Undergraduate"
    @Override
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

// Define the Postgraduate class inheriting from Degree
class Postgraduate extends Degree {
    // Method to print "I am a Postgraduate"
    @Override
    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

// Main class to test the functionality
public class pract_21 {
    public static void main(String[] args) {
        // Create an object of Degree
        Degree degree = new Degree();
        degree.getDegree();  // Should print "I got a degree"
        
        // Create an object of Undergraduate
        Undergraduate undergraduate = new Undergraduate();
        undergraduate.getDegree();  // Should print "I am an Undergraduate"
        
        // Create an object of Postgraduate
        Postgraduate postgraduate = new Postgraduate();
        postgraduate.getDegree();  // Should print "I am a Postgraduate"
    }
}

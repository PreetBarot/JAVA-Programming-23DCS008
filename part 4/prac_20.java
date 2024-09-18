// Define the base class Shape
class Shape {
    // Method to print "This is a shape"
    public void printShape() {
        System.out.println("This is a shape");
    }
}

// Define the Rectangle class inheriting from Shape
class Rectangle extends Shape {
    // Method to print "This is rectangular shape"
    public void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

// Define the Circle class inheriting from Shape
class Circle extends Shape {
    // Method to print "This is circular shape"
    public void printCircle() {
        System.out.println("This is circular shape");
    }
}

// Define the Square class inheriting from Rectangle
class Square extends Rectangle {
    // Method to print "Square is a rectangle"
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

// Main class to test the functionality
public class prac_20
{
    public static void main(String[] args) {
        // Create an object of Square
        Square square = new Square();
        
        // Call the methods from Shape and Rectangle classes
        square.printShape();      // Inherited from Shape
        square.printRectangle(); // Inherited from Rectangle
    }
}

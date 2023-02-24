import java.util.Scanner;

public class static_method {

    // A static method is a method that belongs to a 
    // class rather than an instance of a class. This means
    // you can call a static method without creating an object of 
    // the class.
    // Static methods are sometimes called class methods.


    // You can access static methods from outside of the class in which
    // they are defined. This is not possible with non-static methods.

    // Subclasses can override static methods, but non-static methods cannot.

    // Static methods are executed when an instance of the class is created, 
    // whereas non-static methods are not.

    // Static methods can be used to create utility classes that contain general-purpose methods.
    
    // You can use static methods to enforce encapsulation since they can only
    // be called from within the class in which they are defined.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        scan.close();
    }
}
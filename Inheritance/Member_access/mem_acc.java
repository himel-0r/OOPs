package OOPs.Inheritance.Member_access;

public class mem_acc {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}

/*
 * In a class hierarchy, private members remain
 * private to their class.
 * This program contains an error and will not
 * compile.
 */

// Create a superclass.
class A {
    int i; // default access
    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// A's j is not accessible here.
class B extends A {
    int total;

    void sum() {
        // total = i + j; // ERROR, j is not accessible here
    }
}

/*
 * A class member that has been declared as private will remain private to its
 * class.
 * It is not accessible by any code outside its class, including subclasses
 */
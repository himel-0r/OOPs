public class outer_and_inner_class {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

// Demonstrate an inner class.
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an inner class
    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
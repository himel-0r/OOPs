package VarArgs;

public class VarArgs_2_using_dots {
    // vaTest() now uses a vararg.
    static void vaTest(int... v) {
        System.out.print("Number of args: " + v.length + " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Notice how vaTest() can be called with a
        // variable number of arguments.
        vaTest(10); // 1 arg
        vaTest(1, 2, 3); // 3 args
        vaTest(); // no args
    }
}

// Use varargs with standard arguments.
class VarArgs2 {
    // Here, msg is a normal parameter and v is a
    // varargs parameter.
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length +
                " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void makiinggg(String[] args) { // Main method, XD
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}

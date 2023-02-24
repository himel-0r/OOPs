package unit7;

/*
When an overloaded method is called, Java looks for a match between the arguments 
used to call the method and the method’s parameters. 
However, this match need not always be exact. In some cases, 
Java’s automatic type conversions can play a role in overload resolution.
*/

public class overloading {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        ob.test();
        ob.test(10, 20);
        ob.test(i); // this will invoke test(double)
        ob.test(123.2); // this will invoke test(double)
    }
}

// Automatic type conversions apply to overloading.
class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}


/* 
 * As you can see, this version of OverloadDemo does not define test(int). 
 * Therefore, when test( ) is called with an integer argument inside Overload, 
 * no matching method is found. However, Java can automatically 
 * convert an integer into a double, and this conversion can be used to resolve the call.
 * Therefore, after test(int) is not found, Java elevates i to double
 * and then calls test(double). Of course, if test(int) had been defined, 
 * it would have been called instead.
 */
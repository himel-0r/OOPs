package Exception_Handling.Sir_codes;

public class ONE_DivideByZero {
    public static void main(String args[]) {
        int a = 1, b = 0;
        try {
            System.out.println("Value: " + a / b);
            System.out.println("Something.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After try-catch statement.");

    }
}

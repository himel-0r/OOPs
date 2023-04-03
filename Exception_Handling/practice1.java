package OOPs.Exception_Handling;

public class practice1 {
    public static void main(String[] args) {
        int d = 0;

        try{
        int a = 42/d;

        System.out.println(a);
        }
        catch (Exception e) {
            System.out.println("Exception is " + e);
        }
        finally {
            System.out.println("This is finally.");
        }
    }
}

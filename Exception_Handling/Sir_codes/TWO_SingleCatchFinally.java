package Exception_Handling.Sir_codes;

public class TWO_SingleCatchFinally {
    public static void main(String[] args) {
        int a = 1, b = 0;

        try{
            System.out.println("Value: " + a/b);
            System.out.println("Something");
        }
        catch (Exception e)
        {
            System.out.println("Exception " + e);
        }
        finally
        {
            System.out.println("Finally");
        }
        System.out.println("After");
    }    
}

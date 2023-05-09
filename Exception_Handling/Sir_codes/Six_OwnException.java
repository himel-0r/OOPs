package Exception_Handling.Sir_codes;

// import java.util.logging.Level;
// import java.util.logging.Logger;

public class Six_OwnException {
    
    static void demo (){
        try {
            throw new MyException();
        } catch (MyException ex) {
            System.out.println("Inside catch of demo()'s try-catch.");
        }
    }
    public static void main(String args[]) throws Throwable{
        demo();
        throw new MyException();
    }
}

class MyException extends Throwable{
    public MyException(){
        System.out.println("Inside constructor of MyException.");
    }
    
}
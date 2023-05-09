package Exception_Handling.Sir_codes;

import java.io.*;
import java.util.*;

public class Seven_rethrow {

    // public void has_unchecked(){ //requires no throws even though exception is thrown
    // throw new ArithmeticException();
    // }

    public static void has_checked() throws Exception {
        throw new FileNotFoundException();
    }

    public static void calling_throw() throws Exception {
        has_checked();
        System.out.println("");
    }

    public static void main(String[] args) throws Exception {
        try {
            calling_throw();
        } catch (Exception ex) {
            throw ex;
        }
    }
}
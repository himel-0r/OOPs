package OOPs.LabCode;

public class split_gfg {

    // Main driver method
    public static void main(String args[]) {
        // Custom input string
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);

        for (String a : arrOfStr)
            System.out.println(a);
    }
}

public class reffering_same_object {
    public static void main(String[] args) {
        Box b1 = new Box();

        b1.h = 10;
        b1.l = 20;
        b1.w = 30;

        Box b2 = b1;

        b1.h = 11;
        b1.l = 21;
        b1.w = 31;

        b1 = null;

        System.out.println(b2.h + " " + b2.l + " " + b2.w);

        // Once b2 gets the reference of b1, it does not matter if we make "b1 = null"
        // The reference is unchanged.
        
    }
}

class Box {
    int h; 
    int w;
    int l;
}
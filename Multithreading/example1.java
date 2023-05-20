package Multithreading;

public class example1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current: " + t);

        t.setName("onek moja");
        System.out.println("Current: " + t);

        try {
            for (int i=10; i>0; i--)
            {
                System.out.println(i);
                Thread.sleep(100 * i);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Interrupted!!!");
        }
    }
}

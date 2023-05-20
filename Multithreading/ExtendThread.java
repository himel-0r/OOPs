package Multithreading;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i=4; i>=0; i--)
            {
                System.out.println("Main " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("main interruped");
        }
        System.out.println("Main end");
    }
}

class NewThread extends Thread{
    NewThread()
    {
        super ("Demoooooo_oo");
        System.out.println("Child thread :" + this);
        start();
    }

    // Entry point
    public void run()
    {
        try {
            for (int i=0; i<5; i++)
            {
                System.out.println("Child " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child interrupted.");
        }

        System.out.println("Child end");
    }
}

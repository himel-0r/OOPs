package Multithreading;

// This process is done my implementing the "Runnable" class

public class new_thread {
    public static void main(String[] args) {
        new new_thread_making(); // create a new thread

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main thread : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Mainnn " + e);
        }
        System.out.println("Mainnnnn thread.");
    }
}

class new_thread_making implements Runnable{
    Thread t;
    new_thread_making()
    {
        // Create new thread
        t = new Thread(this, "Demoooo thread");
        System.out.println("child thread: " + t);
    
        t.start();
    }
        // This is the entry point of the second thread
        public void run()
        {
            try{
                for (int i=5; i>0; i--)
                {
                    System.out.println("Child thread: " + i);
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e)
            {
                System.out.println("Exception: " + e);
            }
            System.out.println("Existing child thread.");
        }
}

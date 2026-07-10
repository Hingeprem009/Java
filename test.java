class Counter
{
    int count;
    public synchronized void increment() 
    // synchronized ensures that only one thread can execute
    // this method at a time, preventing race conditions.
    {
        count++;
    }
}
public class test
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter c = new Counter();
        Runnable obj1 = () ->
        {
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };
        Runnable obj2 = () ->
        {
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Starts both threads concurrently.
        t1.start();
        t2.start();

        // Wait until both threads finish execution before
        // printing the final counter value.
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
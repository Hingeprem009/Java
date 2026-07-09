class A implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("hi");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("hello");
            try{
                Thread.sleep(10); // Pauses the current thread for 10 milliseconds
            } catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}
public class RunnableDemo{
    public static void main(String[] args)
    {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
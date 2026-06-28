abstract class Car
{
    public abstract void drive(); //if any method abstract make class also abstract
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("play music");
    }
}

abstract class WagnoR extends Car
{
    public void drive()
    {
        System.out.println("Driving..");
    }
}

class UpdatedWagonR extends WagnoR //concrete class
{
    public void fly() 
    {
        System.out.println("Flying..");
    }
}

public class abstractClass
{
    public static void main(String[] args)
    {
        Car obj = new UpdatedWagonR(); // we can't create object of abstract class 
        //if want to create object use concrete class 
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
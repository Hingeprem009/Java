class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class downUpCasting
{
    public static void main(String[] args)
    {
        A obj = new B(); // Upcasting
        obj.show1(); 

        B obj1 = (B) obj;   //Downcasting
        obj1.show2();
    }
}
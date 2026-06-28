final class Calc // Stops inheritance
{
    public final void show() // stops method overriding using final keyword
    {
        System.out.println("in Calc Show");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc // Error because Calc is a final class
{
    public void show() //Error bz use of final keyword in method
    {
        System.out.println("By Jay");
    }
}

public class finalKeyword
{
    public static void main(String[] args)
    {
        // final keyword is like constant 
        // use with variable, method, class
        final int num = 9;
        num = 10;
        System.out.println(num);

        //Using final with Class
        Calc obj = new Calc();
        obj.show();
        obj.add(3,3);

    }
}
class Calc
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

class AdvCalc extends Calc
{
    // Overriding the add() method of the Calc class
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
} 

public class Metdover
{
    public static void main(String[] args)
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3,4);
        System.out.println(r1);
    }
}

public class Calculator{
    public static void main(String[] args)
    {
        SciCalc obj = new SciCalc();
        int r1 = obj.add(2, 2);        
        int r2 = obj.sub(4, 2);
        int r3 = obj.multi(7, 2);
        int r4 = obj.div(15, 3); 
        double r5 = obj.power(4, 2);
        System.out.println(("Add: ") + r1);
        System.out.println(("Sub:") + r2);
        System.out.println(("Multi:") + r3);
        System.out.println(("div:") + r4);
        System.out.println(("Power: ") + r5);
    }
}
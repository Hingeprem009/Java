@FunctionalInterface
interface A //A functional interface can have only one abstract method
{
    int add(int i, int j);
}

public class functionalInterface
{
    public static void main(String[] args)
    {
        A obj = (i,j) -> i+j; //Lambda expression only works with functional interface
        int result = obj.add(1,1);
        System.out.println(result);
    }
}
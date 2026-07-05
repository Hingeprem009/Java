public class ExceptionHandlingDemo
{
    public static void main(String[] args)
    {
        int i = 2;
        int j = 0;

        int[] nums =  new int[5];
        String str = "prem";
        
        try
        {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e) // Executes when an arithmetic exception occurs
        {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please enter a valid index");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong: " + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
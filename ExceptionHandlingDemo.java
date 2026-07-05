public class ExceptionHandlingDemo
{
    public static void main(String[] args)
    {
        int i = 0;
        int j = 0;
        
        try
        {
            j = 18 / i;
        }
        catch (Exception e) // Executes when an exception occurs 
        {
            System.out.println("Something went wrong...");
        }

        System.out.println("Bye " + j);
    }
}
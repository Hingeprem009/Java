class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}

public class Throw
{
    public static void main(String[] args)
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18 / i;

            if (j == 0)
            {
                throw new MyException("I don't want to print zero");
            }

            System.out.println("Result: " + j);
        }
        catch (MyException e)
        {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong: " + e);
        }

        System.out.println("Bye");
    }
}
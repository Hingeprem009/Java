
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Finally{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        int num = 0;
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally // finally ensures that all resources are closed.
        {
            if(br != null)
            {
                br.close(); // Close the BufferedReader to prevent resource leaks.
            }
        }
    }
}
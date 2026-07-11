
import java.util.*;
public class Stringsorting{
    public static void main(String[] args)
    {
        Comparator<String> com = new Comparator<String>()
        {
            public int compare(String s1, String s2)
            {
                if(s1.length() > s2.length())
                {
                    return 1;
                }
                else if (s1.length() < s2.length())
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        };

        List<String> names = new ArrayList<>();
        names.add("Prem");
        names.add("Mayur");
        names.add("Om");
        names.add("Tim");

        Collections.sort(names, com);
        System.out.println(names);
    }
}
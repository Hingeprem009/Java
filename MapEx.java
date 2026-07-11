//Map is the collection of key and value pairs
import java.util.*;

public class MapEx {
    public static void main(String[] args)
    {
        Map<String, Integer> students = new HashMap<>();

        students.put("Prem", 21);
        students.put("Mayur", 22);
        students.put("Ajay", 23);
        students.put("Tim", 1);
        students.put("Prem", 20); //keys can not be repeated update the same

        //System.out.println(students);
        //System.out.println(students.get("Prem"));
        
        //using for loop
        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
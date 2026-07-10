import java.util.*;

public class CollectionAndList {
    public static void main(String[] args)
    {
        // List maintains insertion order and allows index-based access.
        List<Integer> nums = new ArrayList<Integer>(); 

        //Collection<Integer> nums = new ArrayList<Integer>(); 

        // Collection supports basic operations like add(), remove(), and contains(),
        // but it does not provide index-based methods such as get() or indexOf().

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums.get(2)); //8
        System.out.println(nums.indexOf(6)); //0

        for (int num : nums)
        {
            System.out.println(num * 2); // Prints each element multiplied by 2.
        }
    }
}
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetImplementations {
    public static void main(String[] args)
    {
        //Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>(); // TreeSet stores elements in sorted (ascending) order.
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        // A Set does not allow duplicate elements and does not support index-based access.

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext())
        {
            System.out.println(values.next());
        }

        //for(int n : nums)
        //{
        //    System.out.println(n);
        //}
    }
}
import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Prem","Mayur","Parth","Sneha");
        List<String> uNames = names.stream()
                .map(String::toUpperCase) 
                .toList();

        uNames.forEach(System.out::println);
    }
}
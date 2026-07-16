import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Prem", "Mayur", "Ajay", "Laxmi");

        Optional<String> name = names.stream()
        // If no matching name is found, Optional lets us return a default value using orElse().
                .filter(str -> str.contains("x"))
                .findFirst();

        System.out.println(name.orElse("Not found"));
    }
}
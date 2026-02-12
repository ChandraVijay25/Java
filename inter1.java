import java.util.*;

public class inter1 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", "python", "spring", "react");

        // Using forEach() and lambda
        names.forEach(name -> System.out.println(name.toUpperCase()));
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {

        
        List<String> names = new ArrayList<>();

        names.add("Reshma");
        names.add("Priya");
        names.add("Kavin");
        names.add("Anu");
        names.add("Vijay");

        System.out.println("Before Sorting:");
        System.out.println(names);

        
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("After Sorting:");
        System.out.println(names);
    }
}

import java.util.List;
import java.util.stream.Collectors;


record Person(String name, int age) {}

public class RecordsExample {
    public static void main(String[] args) {

        
        Person p1 = new Person("Reshma", 20);
        Person p2 = new Person("Priya", 17);
        Person p3 = new Person("Kavin", 22);

        
        System.out.println("Person Details:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        
        List<Person> persons = List.of(p1, p2, p3);

        
        List<Person> adults = persons.stream()
                                     .filter(person -> person.age() >= 18)
                                     .collect(Collectors.toList());

        System.out.println("\nAdults (Age >= 18):");
        adults.forEach(System.out::println);
    }
}

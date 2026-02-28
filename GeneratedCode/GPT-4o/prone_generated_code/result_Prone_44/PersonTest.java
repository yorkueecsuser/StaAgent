import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;

public class PersonTest {

    @Test
    public void testPersonHashSetBehavior() {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        
        Set<Person> people = new HashSet<>();
        people.add(person1);

        assertTrue("The set should contain person2 but it does not due to missing hashCode implementation.", people.contains(person2)); // TRIGGER BUG: EqualsHashCode
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testShowBug() {
        String[] names1 = {"John", "Doe"};
        String[] names2 = {"John", "Doe"};
        Person person1 = new Person(names1, 30);
        Person person2 = new Person(names2, 30);

        // TRIGGER BUG: Equals method should be overridden in records containing array fields
        assertFalse(Person.showBug(person1, person2));
    }
}
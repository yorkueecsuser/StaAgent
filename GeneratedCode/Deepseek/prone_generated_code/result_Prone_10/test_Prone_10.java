import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testConstructorOrder() {
        // TRIGGER BUG: AutoValueConstructorOrderChecker
        Person person = new Person("John", 30); // Bug is triggered here
        assertEquals("John", person.getName());
        assertEquals(30, person.getAge());
    }
}
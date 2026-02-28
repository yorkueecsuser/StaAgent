import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testDefaultValues() {
        Person person = Person.builder().build(); // TRIGGER BUG: AutoValueBuilderDefaultsInConstructor
        assertEquals("Unknown", person.name());
        assertEquals(0, person.age());
    }

    @Test
    public void testSetValues() {
        Person person = Person.builder()
               .setName("John")
               .setAge(30)
               .build();
        assertEquals("John", person.name());
        assertEquals(30, person.age());
    }
}
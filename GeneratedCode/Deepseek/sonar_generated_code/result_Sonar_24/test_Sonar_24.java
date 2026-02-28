import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test // TRIGGER BUG: Equals method should be overridden in records containing array fields
    public void testEqualsMethod() {
        Person person1 = new Person(new String[]{"John", "Doe"}, 30);
        Person person2 = new Person(new String[]{"John", "Doe"}, 30);
        
        // This should return false (because equals method is not overridden), but returns true due to reference equality
        assertEquals(person1, person2); 
    }
}
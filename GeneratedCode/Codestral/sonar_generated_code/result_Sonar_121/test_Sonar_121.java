import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugTest {

    @Test
    public void testIsEqual() {
        CompareToBug.Person person1 = new CompareToBug.Person(30);
        CompareToBug.Person person2 = new CompareToBug.Person(30);
        // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertTrue(CompareToBug.isEqual(person1, person2));
    }
}
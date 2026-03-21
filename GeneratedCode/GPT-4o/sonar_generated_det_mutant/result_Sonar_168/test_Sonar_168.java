import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testShowBug() {
        Person person = new Person("Example", 25);
        person.showBug(); // TRIGGER BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    }
}
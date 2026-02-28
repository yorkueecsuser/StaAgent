import org.junit.Test;
import static org.junit.Assert.*;

public class AutoValueExampleTest {

    @Test
    public void testShowBug() {
        AutoValueExample example = new AutoValueExample();
        Person person = example.showBug(); // TRIGGER BUG: AutoValueConstructorOrderChecker
        assertEquals("John Doe", person.name());
        assertEquals(30, person.age());
    }
}
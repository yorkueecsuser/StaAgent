import org.junit.Test;
import static org.junit.Assert.*;

public class InstantiationToGetClassExampleTest {

    @Test
    public void testShowBug() {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        Class<?> result = example.showBug(); // TRIGGER BUG: InstantiationToGetClass
        assertEquals(String.class, result);
    }
}
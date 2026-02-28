import org.junit.Test;
import static org.junit.Assert.*;

public class GetClassOnClassExampleTest {

    @Test
    public void testShowBug() {
        GetClassOnClassExample example = new GetClassOnClassExample();
        String result = example.showBug(); // TRIGGER BUG: GetClassOnClass
        assertEquals("java.lang.String", result); // TRIGGER BUG: GetClassOnClass
    }
}
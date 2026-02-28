import org.junit.Test;
import static org.junit.Assert.*;

public class ParentTest {

    @Test
    public void testShowBug() {
        // Trigger the bug
        Child child = new Child();
        List<String> list = child.getList();

        // Assert that the list is not null and is an instance of the ArrayList class
        assertNotNull(list);
        assertTrue(list instanceof ArrayList);
    }
}
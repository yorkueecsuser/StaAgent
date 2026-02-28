import org.junit.Test;
import static org.junit.Assert.*;

class BugExampleTest {
    @Test
    public void testBug() {
        Map<String, String> map = new HashMap();
        map.put("firstName", "John");
        map.put("lastName", "Smith");
        System.out.println(map);
    }
}
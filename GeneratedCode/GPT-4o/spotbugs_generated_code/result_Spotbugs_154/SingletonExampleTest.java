import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {

    @Test
    public void testShowBug() {
        SingletonExample singleton = SingletonExample.getInstance();
        String result = singleton.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
        assertNotNull("Expected a valid string response", result);
        // This assertion will fail because showBug creates another instance, violating singleton pattern
        assertTrue("Result should indicate a singleton instance, but it does not.", result.contains("Singleton instance: " + singleton + ", Another instance: " + singleton));
    }
}
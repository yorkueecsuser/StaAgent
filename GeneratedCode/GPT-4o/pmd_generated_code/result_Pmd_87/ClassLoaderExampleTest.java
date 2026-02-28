import org.junit.Test;
import static org.junit.Assert.*;

public class ClassLoaderExampleTest {

    @Test
    public void testShowBug() {
        ClassLoaderExample example = new ClassLoaderExample();
        ClassLoader cl = example.showBug(); // TRIGGER BUG: UseProperClassLoader
        assertNotNull("ClassLoader should not be null", cl); // TRIGGER BUG: UseProperClassLoader
    }
}
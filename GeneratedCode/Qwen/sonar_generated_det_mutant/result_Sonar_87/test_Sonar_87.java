import org.junit.Test;
import static org.junit.Assert.*;

public class ClassLoaderExampleTest {

    @Test
    public void testShowBug() {
        ClassLoaderExample example = new ClassLoaderExample();
        ClassLoader cl = example.showBug();  // TRIGGER BUG: JEE applications should not "getClassLoader"
        assertNotNull(cl);
    }
}
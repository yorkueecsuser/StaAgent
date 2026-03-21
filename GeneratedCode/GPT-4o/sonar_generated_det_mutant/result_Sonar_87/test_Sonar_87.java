import org.junit.Test;
import static org.junit.Assert.*;

public class ClassLoaderBugExampleTest {
    
    @Test
    public void testShowBug() {
        ClassLoaderBugExample example = new ClassLoaderBugExample();
        ClassLoader classLoader = example.showBug();  // TRIGGER BUG: JEE applications should not "getClassLoader"
        assertNotNull("ClassLoader should not be null", classLoader);
    }
}
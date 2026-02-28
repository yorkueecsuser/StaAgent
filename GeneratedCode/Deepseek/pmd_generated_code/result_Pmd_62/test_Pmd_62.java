import org.junit.Test;
import static org.junit.Assert.*;

public class Bug_NonStaticInitializerTest {

    @Test
    public void testShowBug() {
        Bug_NonStaticInitializer bug = new Bug_NonStaticInitializer();
        bug.showBug(); // TRIGGER BUG: NonStaticInitializer

        // The above line triggers the bug by calling the method showBug().
        // The non-static initializer block will be called prior to the constructor,
        // printing "I am about to construct myself" to the console.
    }
}
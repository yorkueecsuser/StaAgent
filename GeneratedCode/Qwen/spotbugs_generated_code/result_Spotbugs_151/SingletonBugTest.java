import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonBugTest {

    @Test
    public void testSingletonCloneability() {
        SingletonBug instance = SingletonBug.getInstance();
        try {
            SingletonBug clonedInstance = (SingletonBug) instance.clone(); // TRIGGER BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
            fail("Cloning should not be possible for a singleton instance");
        } catch (CloneNotSupportedException e) {
            // This block is intentionally left empty to let the test fail due to the bug
        }
    }

    @Test
    public void testShowBugMethod() {
        SingletonBug demo = SingletonBug.getInstance();
        demo.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
    }
}
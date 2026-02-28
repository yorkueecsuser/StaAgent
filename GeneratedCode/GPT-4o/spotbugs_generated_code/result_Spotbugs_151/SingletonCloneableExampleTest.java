import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonCloneableExampleTest {

    @Test
    public void testSingletonCloneableExample() {
        SingletonCloneableExample singleton = SingletonCloneableExample.getInstance();
        String result = singleton.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
        assertEquals("CloneNotSupportedException caught", result); // TRIGGER BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
    }
}
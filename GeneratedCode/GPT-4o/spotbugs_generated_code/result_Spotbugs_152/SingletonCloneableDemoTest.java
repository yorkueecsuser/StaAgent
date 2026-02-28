import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonCloneableDemoTest {

    @Test
    public void testShowBug() {
        SingletonCloneableDemo demo = new SingletonCloneableDemo();
        demo.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    }
}
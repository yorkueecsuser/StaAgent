import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonClassTest {

    @Test
    public void testShowBug() throws CloneNotSupportedException {
        SingletonClass instance = SingletonClass.getInstance();
        // TRIGGER BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
        SingletonClass clonedInstance = (SingletonClass) instance.showBug();
        assertNotSame(instance, clonedInstance);
    }
}
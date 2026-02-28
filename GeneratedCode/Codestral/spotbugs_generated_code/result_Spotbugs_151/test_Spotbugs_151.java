import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonBugTest {

    @Test
    public void testShowBug() throws CloneNotSupportedException {
        SingletonBug.getInstance().showBug();  // TRIGGER BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
    }
}
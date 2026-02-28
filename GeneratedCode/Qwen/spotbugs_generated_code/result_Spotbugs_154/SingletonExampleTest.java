import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {

    @Test
    public void testShowBugTriggersException() {
        SingletonExample originalInstance = SingletonExample.getInstance();
        originalInstance.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR) 
    }
}
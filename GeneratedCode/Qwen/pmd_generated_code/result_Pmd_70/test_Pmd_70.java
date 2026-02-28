import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        Singleton.showBug(); // TRIGGER BUG: SingleMethodSingleton
    }
}
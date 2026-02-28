import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {

    @Test
    public void testSingletonInstance() {
        SingletonExample instance1 = SingletonExample.getInstance(); // TRIGGER BUG: SingletonClassReturningNewInstance
        SingletonExample instance2 = SingletonExample.getInstance(); // TRIGGER BUG: SingletonClassReturningNewInstance

        // The bug will cause these assertions to fail because two different instances will be created
        assertSame(instance1, instance2);
    }

    @Test
    public void testShowBug() {
        SingletonExample example = SingletonExample.getInstance(); // TRIGGER BUG: SingletonClassReturningNewInstance
        example.showBug(); // TRIGGER BUG: SingletonClassReturningNewInstance
    }
}
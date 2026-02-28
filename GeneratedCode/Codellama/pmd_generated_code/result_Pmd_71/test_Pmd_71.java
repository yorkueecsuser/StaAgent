import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonClassReturningNewInstanceTest {

    @Test
    public void testBug() {
        SingletonClassReturningNewInstance instance1 = SingletonClassReturningNewInstance.getInstance();
        instance1.addData("first");
        instance1.addData("second");
        instance1.addData("third");

        SingletonClassReturningNewInstance instance2 = SingletonClassReturningNewInstance.getInstance();
        instance2.addData("fourth");
        instance2.addData("fifth");
        instance2.addData("sixth");

        assertEquals(6, instance1.getData().size()); // TRIGGER BUG: SingletonClassReturningNewInstance
        assertEquals(6, instance2.getData().size());
    }
}
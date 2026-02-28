import org.junit.Test;
import static org.junit.Assert.*;

public class SingleMethodSingletonTest {
    @Test
    public void testShowBug() {
        SingleMethodSingleton instance1 = SingleMethodSingleton.getInstance();
        instance1.setData("key1", "value1");
        SingleMethodSingleton instance2 = SingleMethodSingleton.getInstance();
        // BUG: SingleMethodSingleton
        // The instance created using the overloaded getInstance method is not cached,
        // and so a new object will be created for every invocation.
        instance2.setData("key2", "value2");
        System.out.println(instance1.getData("key1"));
        System.out.println(instance2.getData("key2"));
    }
}
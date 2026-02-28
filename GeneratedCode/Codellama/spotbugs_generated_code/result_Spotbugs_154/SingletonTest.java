import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = new Singleton(); // TRIGGER BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)

        s1.addData("Hello");
        s2.addData("World");

        assertEquals(s1.getData(), s2.getData());
    }
}
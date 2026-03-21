import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {

    @Test
    public void testBug() {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        // The following line will fail if the SingletonExample class is not acting as a Singleton
        assertEquals(obj1, obj2);

        // TRIGGER BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)

        // The following line will trigger the bug if the SingletonExample class is serializable
        assertNotEquals(obj1.showBug(), obj2.showBug());
    }
}
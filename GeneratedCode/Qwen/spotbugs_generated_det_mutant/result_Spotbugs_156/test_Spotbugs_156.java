import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {

    @Test
    public void testSingletonInstantiation() {
        SingletonExample example = SingletonExample.getInstance(); // TRIGGER BUG: SING: Instance-getter method of class using singleton design pattern is not synchronized. (SING_SINGLETON_GETTER_NOT_SYNCHRONIZED)
        example.showBug();
    }
}
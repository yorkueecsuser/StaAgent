import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {

    @Test
    public void testShowBug() {
        SingletonExample example = SingletonExample.getInstance(); // Use the public method to get an instance
        example.showBug(); // TRIGGER BUG: SingleMethodSingleton
    }
}
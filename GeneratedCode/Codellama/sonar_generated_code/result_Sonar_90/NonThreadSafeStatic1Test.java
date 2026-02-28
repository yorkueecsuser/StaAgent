import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeStatic1Test {

    @Test
    public void testBug() {
        NonThreadSafeStatic1 nonThreadSafeStatic1 = new NonThreadSafeStatic1();
        nonThreadSafeStatic1.showBug();
    }
}
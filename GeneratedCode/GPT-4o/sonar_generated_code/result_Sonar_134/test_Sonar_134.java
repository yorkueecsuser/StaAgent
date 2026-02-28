import org.junit.Test;
import static org.junit.Assert.*;

public class BoxingUnboxingExampleTest {

    @Test
    public void testShowBug() {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug(); // TRIGGER BUG: Unnecessary boxing and unboxing should be avoided
    }
}
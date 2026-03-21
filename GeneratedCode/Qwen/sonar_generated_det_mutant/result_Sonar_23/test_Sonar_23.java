import org.junit.Test;
import static org.junit.Assert.*;

public class ClassCastExampleTest {

    @Test
    public void testShowBug() {
        ClassCastExample example = new ClassCastExample();
        example.showBug(); // TRIGGER BUG: Cast operations should not trigger a ClassCastException
    }
}
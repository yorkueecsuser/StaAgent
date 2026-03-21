import org.junit.Test;
import static org.junit.Assert.*;

public class MyExampleTest {

    @Test
    public void testShowBug() {
        MyExample example = new MyExample(5);
        example.showBug(); // TRIGGER BUG: Assertions should not compare an object to itself
    }
}
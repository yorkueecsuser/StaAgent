import org.junit.Test;
import static org.junit.Assert.*;

public class ComparingThisWithNullDemoTest {

    @Test
    public void testShowBug() {
        ComparingThisWithNullDemo demo = new ComparingThisWithNullDemo();
        String result = demo.showBug();
        assertEquals("this == null: false, this != null: true", result); // TRIGGER BUG: ComparingThisWithNull
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadGroupExampleTest {

    @Test
    public void testShowBug() {
        ThreadGroupExample example = new ThreadGroupExample();
        String result = example.showBug("Example Group"); // TRIGGER BUG: AvoidThreadGroup
        assertNull("The method should trigger the bug and fail", result);
    }
}
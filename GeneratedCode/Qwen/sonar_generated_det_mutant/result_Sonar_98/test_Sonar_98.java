import org.junit.Test;
import static org.junit.Assert.*;

public class StreamReadBugTest {

    @Test
    public void testShowBug() {
        StreamReadBug bugDemo = new StreamReadBug();
        bugDemo.showBug("non_existent_file.txt");  // TRIGGER BUG: The value returned from a stream read should be checked
    }
}
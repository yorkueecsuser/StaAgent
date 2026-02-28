import org.junit.Test;
import static org.junit.Assert.*;

public class StreamToStringExampleTest {

    @Test
    public void testShowBug() {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(); // TRIGGER BUG: StreamToString
        assertEquals("Expected stream contents but got identity hashcode", "[apple, banana, cherry]", result);
    }
}
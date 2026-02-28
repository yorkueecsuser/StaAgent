import org.junit.Test;
import static org.junit.Assert.*;

public class StreamToStringExampleTest {

    @Test
    public void testShowBug() {
        StreamToStringExample example = new StreamToStringExample();
        String result = example.showBug(new String[]{"apple", "banana", "cherry"}); // TRIGGER BUG: StreamToString
        assertEquals("Expected a meaningful string representation of the stream", "[apple, banana, cherry]", result); // TRIGGER BUG: StreamToString
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

class StreamToStringTest {
    @Test
    public void testShowBug() {
        String actual = StreamToString.showBug();
        String expected = "java.util.stream.ReferencePipeline$Head@6d06d69c";
        assertEquals(expected, actual);
    }

    @Test
    public void testShowBugWithStreamToString() {
        String actual = StreamToString.showBugWithStreamToString();
        String expected = "java.util.stream.ReferencePipeline$Head@6d06d69c";
        assertEquals(expected, actual);
    }
}
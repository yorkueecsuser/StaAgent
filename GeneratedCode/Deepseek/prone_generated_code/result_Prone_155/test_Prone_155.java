import org.junit.Test;
import static org.junit.Assert.*;
import java.util.stream.Stream;

public class StreamToStringExampleTest {

    @Test
    public void testShowBug() {
        StreamToStringExample example = new StreamToStringExample();
        // TRIGGER BUG: StreamToString
        assertNotEquals(example.showBug(), "java.util.stream.ReferencePipeline$Head@6d06d69c");
    }
}
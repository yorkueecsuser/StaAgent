import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableReturnBugExampleTest {

    @Test
    public void testShowBugWithCommand() {
        ImmutableReturnBugExample example = new ImmutableReturnBugExample();
        String command = "TEST";
        String result = example.showBug(command);

        assertEquals("TEST", result); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }

    @Test
    public void testShowBugWithCollection() {
        ImmutableReturnBugExample example = new ImmutableReturnBugExample();
        java.util.Collection<String> collection = java.util.Arrays.asList("one", "two", "three");
        int size = collection.size();
        int resultSize = example.showBug(collection);

        assertEquals(size, resultSize); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }

    @Test
    public void testShowBugWithStream() {
        ImmutableReturnBugExample example = new ImmutableReturnBugExample();
        java.util.stream.Stream<String> stream = java.util.stream.Stream.of("one", "two", "three");
        long count = stream.count();
        long resultCount = example.showBug(java.util.stream.Stream.of("one", "two", "three"));

        assertEquals(count, resultCount); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }
}
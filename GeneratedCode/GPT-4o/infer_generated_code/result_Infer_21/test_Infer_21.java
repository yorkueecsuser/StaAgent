import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteExecutionExampleTest {

    @Test
    public void testShowBugWithSquareRoot() {
        InfiniteExecutionExample example = new InfiniteExecutionExample();
        StringBuilder builder = new StringBuilder();
        int result = example.showBug(10, builder, "test"); // TRIGGER BUG: INFINITE_EXECUTION_TIME​
        assertEquals(4, result); // This will likely cause a timeout or infinite loop
    }

    @Test
    public void testShowBugWithLoopOverCharArray() {
        InfiniteExecutionExample example = new InfiniteExecutionExample();
        StringBuilder builder = new StringBuilder();
        example.showBug(1, builder, "test"); // TRIGGER BUG: INFINITE_EXECUTION_TIME​
        assertEquals("test", builder.toString()); // This will likely cause a timeout or infinite loop
    }

    @Test
    public void testShowBugWithTopCostCall() {
        InfiniteExecutionExample example = new InfiniteExecutionExample();
        StringBuilder builder = new StringBuilder();
        example.showBug(1, builder, ""); // TRIGGER BUG: INFINITE_EXECUTION_TIME​
        assertEquals(1, builder.length()); // This will likely cause a timeout or infinite loop
    }
}
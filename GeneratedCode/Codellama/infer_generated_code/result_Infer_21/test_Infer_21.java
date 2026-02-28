import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteExecutionTimeTest {
    @Test
    public void testSquareRoot() {
        InfiniteExecutionTime infiniteExecutionTime = new InfiniteExecutionTime();
        int x = 1;
        infiniteExecutionTime.square_root_FP(x);
        // TRIGGER BUG: INFINITE_EXECUTION_TIME​
    }

    @Test
    public void testLoopOverCharArray() {
        InfiniteExecutionTime infiniteExecutionTime = new InfiniteExecutionTime();
        String input = "hello";
        infiniteExecutionTime.loop_over_charArray_FP(new StringBuilder(), input);
        // TRIGGER BUG: INFINITE_EXECUTION_TIME​
    }

    @Test
    public void testCallTopCost() {
        InfiniteExecutionTime infiniteExecutionTime = new InfiniteExecutionTime();
        infiniteExecutionTime.call_top_cost_FP();
        // TRIGGER BUG: INFINITE_EXECUTION_TIME​
    }
}
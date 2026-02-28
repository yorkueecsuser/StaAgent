import org.junit.Test;

public class InfiniteLoopExampleTest {

    @Test(expected = AssertionError.class)
    public void testShowBug1() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug(); // TRIGGER BUG: Loops should not be infinite
        fail("Expected an infinite loop to occur"); // This line ensures the test fails
    }

    @Test(expected = AssertionError.class)
    public void testShowBug2() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug(); // TRIGGER BUG: Loops should not be infinite
        fail("Expected an infinite loop to occur"); // This line ensures the test fails
    }

    @Test(expected = AssertionError.class)
    public void testShowBug3() {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug(); // TRIGGER BUG: Loops should not be infinite
        fail("Expected an infinite loop to occur"); // This line ensures the test fails
    }
}
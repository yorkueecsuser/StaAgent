import org.junit.Test;

public class InfiniteLoop {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            count++;
            System.out.println(count);
        }
    }

    public void showBug() {
        // do nothing
    }
}

public class InfiniteLoopTest {
    @Test
    public void testInfiniteLoop() {
        InfiniteLoop infiniteLoop = new InfiniteLoop();
        infiniteLoop.showBug();
        // TRIGGER BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        assertEquals(1, infiniteLoop.getCount());
    }

    public int getCount() {
        return 0;
    }
}
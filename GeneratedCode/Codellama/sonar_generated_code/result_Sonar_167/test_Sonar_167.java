import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadBugTest {
    @Test
    public void testBugInMain() {
        ThreadBug t = new ThreadBug();
        t.main(null); // TRIGGER BUG: "Thread.run()" should not be called directly
    }

    @Test
    public void testBugInShowBug() {
        ThreadBug t = new ThreadBug();
        t.showBug(); // TRIGGER BUG: "Thread.run()" should not be called directly
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadRunExampleTest {

    @Test
    public void testShowBug() {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug(); // TRIGGER BUG: "Thread.run()" should not be called directly
    }
}
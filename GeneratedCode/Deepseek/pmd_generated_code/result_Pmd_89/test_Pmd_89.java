import org.junit.Test;
import static org.junit.Assert.*;

public class BugAvoidSynchronizedStatementTest {
    BugAvoidSynchronizedStatement bugInstance = new BugAvoidSynchronizedStatement();

    @Test
    public void testShowBug() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                bugInstance.showBug();
            }).start();
        }
        // TRIGGER BUG: AvoidSynchronizedStatement
    }
}
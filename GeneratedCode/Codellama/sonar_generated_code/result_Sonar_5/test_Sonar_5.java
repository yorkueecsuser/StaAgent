import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.Thread;

public class VirtualThreadBugTest {
    @Test
    public void testBug() {
        VirtualThreadBug bug = new VirtualThreadBug();
        Thread.startVirtualThread(() -> {
            synchronized (bug) {
                System.out.println("Hello from virtual thread!");
            }
        });
    }
}
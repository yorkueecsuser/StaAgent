import org.junit.Test;
import static org.junit.Assert.*;

public class UsingExecutorServiceTest {

    @Test
    public void testShowBug() {
        UsingExecutorService service = new UsingExecutorService();
        service.showBug(); // TRIGGER BUG: DoNotUseThreads - Using a ThreadPoolExecutor from java.util.concurrent creates threads
    }
}
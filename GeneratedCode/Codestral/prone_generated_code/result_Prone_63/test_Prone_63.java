import org.junit.Test;
import static org.junit.Assert.*;

public class MyServiceTest {
    @Test
    public void testShowBug() {
        MyServiceFactory factory = new MyServiceFactory() {
            @Override
            public MyService create(String name) {
                return new MyService(name); // This line will trigger the bug at runtime
            }
        };
        MyService.showBug(factory); // TRIGGER BUG: GuiceAssistedInjectScoping
    }
}
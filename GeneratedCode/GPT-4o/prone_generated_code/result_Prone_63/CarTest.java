import org.junit.Test;
import static org.junit.Assert.*;

public class GuiceAssistedInjectScopingDemoTest {

    @Test
    public void testShowBug() {
        CarFactory carFactory = new CarFactory() {
            @Override
            public Car create(String model) {
                return new Car(model); // TRIGGER BUG: GuiceAssistedInjectScoping
            }
        };

        GuiceAssistedInjectScopingDemo demo = new GuiceAssistedInjectScopingDemo(carFactory);
        assertEquals("Model X", demo.showBug("Model X")); // TRIGGER BUG: GuiceAssistedInjectScoping
    }
}
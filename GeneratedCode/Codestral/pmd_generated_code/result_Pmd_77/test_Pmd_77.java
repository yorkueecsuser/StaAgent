import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testShowBug() {
        Car car = new Car();
        car.showBug(); // TRIGGER BUG: TestClassWithoutTestCases
    }
}
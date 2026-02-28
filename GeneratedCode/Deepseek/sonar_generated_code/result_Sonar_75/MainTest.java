import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test // TRIGGER BUG: Zero should not be a possible denominator
    public void test_divide() {
        Main main = new Main();
        main.showBug();
    }
}
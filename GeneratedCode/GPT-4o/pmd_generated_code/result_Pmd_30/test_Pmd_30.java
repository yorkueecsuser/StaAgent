import org.junit.Test;
import static org.junit.Assert.*;

public class VarargsConfusionExampleTest {

    @Test
    public void testShowBug1() {
        VarargsConfusionExample.showBug1(); // TRIGGER BUG: ConfusingArgumentToVarargsMethod
    }

    @Test
    public void testShowBug2() {
        VarargsConfusionExample.showBug2(); // TRIGGER BUG: ConfusingArgumentToVarargsMethod
    }
}
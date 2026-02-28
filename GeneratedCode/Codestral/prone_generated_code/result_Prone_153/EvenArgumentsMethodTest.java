import org.junit.Test;
import static org.junit.Assert.*;

public class EvenArgumentsMethodTest {

    @Test
    public void testShowBugWithOddArguments() {
        EvenArgumentsMethod method = new EvenArgumentsMethod();
        String[] oddArgs = {"arg1", "arg2", "arg3"}; // Odd number of arguments
        method.showBug(oddArgs); // TRIGGER BUG: ShouldHaveEvenArgs
    }
}
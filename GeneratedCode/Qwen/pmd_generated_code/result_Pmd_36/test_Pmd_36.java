import org.junit.Test;
import static org.junit.Assert.*;

public class DoNotTerminateVMExampleTest {

    @Test
    public void testShowBug() {
        DoNotTerminateVMExample example = new DoNotTerminateVMExample();
        example.showBug(); // TRIGGER BUG: DoNotTerminateVM
    }
}
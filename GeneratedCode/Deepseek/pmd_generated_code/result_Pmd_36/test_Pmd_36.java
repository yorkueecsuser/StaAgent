import org.junit.Test;
import static org.junit.Assert.*;

public class DoNotTerminateVMTest {

    @Test
    // TRIGGER BUG: DoNotTerminateVM
    // This test will fail as it triggers the DoNotTerminateVM bug
    public void testShowBug() {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}
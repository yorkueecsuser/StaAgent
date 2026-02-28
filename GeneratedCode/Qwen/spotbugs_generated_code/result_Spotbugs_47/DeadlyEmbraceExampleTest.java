import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlyEmbraceExampleTest {

    @Test
    public void testShowBugTriggersDeadlyEmbrace() {
        DeadlyEmbraceExample example = new DeadlyEmbraceExample();
        example.showBug(); // TRIGGER BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE) 
        fail("This test is expected to fail due to the deadly embrace bug."); // This line ensures the test fails, demonstrating the bug.
    }
}
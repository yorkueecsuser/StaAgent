import org.junit.Test;
import static org.junit.Assert.*;

public class OuterClassTest {

    @Test
    public void testShowBug() {
        OuterClass outerClass = new OuterClass();
        outerClass.showBug(); // TRIGGER BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
        // This line triggers the bug by creating a new instance of the InnerClass and setting it in the ThreadLocal of the OuterClass.
        // This creates a circular reference between the OuterClass and the InnerClass, preventing both from being garbage collected, causing a memory leak.
    }
}
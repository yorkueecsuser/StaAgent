import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class UnrelatedClassAndInterfaceBugTest {

    @Test
    public void testShowBugWithUnrelatedComparison() {
        UnrelatedClassAndInterfaceBug bugDemo = new UnrelatedClassAndInterfaceBug();
        bugDemo.showBug(List.of("example"), "example"); // TRIGGER BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        fail("This test should fail because the comparison between a List and a String will always be false.");
    }
}
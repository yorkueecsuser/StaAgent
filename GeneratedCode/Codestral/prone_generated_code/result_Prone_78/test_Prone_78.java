import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testSetDependency() {
        Dependency expectedDependency = new Dependency();
        BuggyClass buggyClass = new BuggyClass(new Dependency());

        buggyClass.setDependency(expectedDependency); // TRIGGER BUG: InjectOnMemberAndConstructor

        Dependency actualDependency = buggyClass.showBug();

        // Since the setter injection didn't work due to the bug,
        // the actualDependency should still be the one set in the constructor,
        // not the one set by the setDependency method.
        assertNotSame(expectedDependency, actualDependency);
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsHashCodeBugTest {

    @Test
    public void testShowBug() {
        EqualsHashCodeBug example = new EqualsHashCodeBug(1, "example");
        example.showBug(); // TRIGGER BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    }
}
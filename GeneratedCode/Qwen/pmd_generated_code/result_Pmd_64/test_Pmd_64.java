import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;
import OverrideBothEqualsAndHashcodeExample.Bar;
import OverrideBothEqualsAndHashcodeExample.Baz;

public class OverrideBothEqualsAndHashcodeExampleTest {

    @Test
    public void testBarEqualsWithoutHashCode() {
        Bar bar1 = new Bar(1, "Alice");
        Bar bar2 = new Bar(1, "Alice");
        HashSet<Bar> set = new HashSet<>();
        bar1.showBug(set, bar1, bar2); // TRIGGER BUG: OverrideBothEqualsAndHashcode
        assertEquals(2, set.size()); // This assertion will fail because bar1 and bar2 are considered different due to missing hashCode
    }

    @Test
    public void testBazHashCodeWithoutEquals() {
        Baz baz1 = new Baz(2, "Bob");
        Baz baz2 = new Baz(2, "Bob");
        HashSet<Baz> set = new HashSet<>();
        baz1.showBug(set, baz1, baz2); // TRIGGER BUG: OverrideBothEqualsAndHashcode
        assertEquals(2, set.size()); // This assertion will fail because baz1 and baz2 are considered different due to missing equals
    }
}
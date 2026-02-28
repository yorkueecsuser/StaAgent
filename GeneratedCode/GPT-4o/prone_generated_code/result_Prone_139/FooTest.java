import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoTruthBugExampleTest {

    @Test
    public void testShowBug() {
        Foo foo = new Foo();
        Foo expectedFoo = new Foo();
        ProtoTruthBugExample example = new ProtoTruthBugExample();

        // This line should trigger the bug in showBug method
        String result = example.showBug(foo, expectedFoo); // TRIGGER BUG: ProtoTruthMixedDescriptors

        // The assertion is expected to fail because of the bug
        assertEquals("Ignoring field number: 1", result);
    }
}
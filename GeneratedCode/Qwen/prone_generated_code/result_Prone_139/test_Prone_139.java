import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoTruthExampleTest {

    @Test
    public void testShowBug() {
        ProtoTruthExample example = new ProtoTruthExample();
        Foo foo = new Foo();
        Foo expectedFoo = new Foo();
        // TRIGGER BUG: ProtoTruthMixedDescriptors
        assertEquals("Bug demonstrated", example.showBug(foo, expectedFoo));
    }
}
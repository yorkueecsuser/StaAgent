import org.junit.Test;
import static org.junit.Assert.*;

class BuggyBuilderTest {
    @Test
    void testBuggyBuilder() {
        BuggyBuilder builder = new BuggyBuilder();
        builder.setFoo(10); // TRIGGER BUG: RedundantSetterCall
        builder.setBar(20); // TRIGGER BUG: RedundantSetterCall
        builder.build();
    }
}
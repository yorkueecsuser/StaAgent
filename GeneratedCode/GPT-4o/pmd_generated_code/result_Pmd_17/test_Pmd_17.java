import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryOperatorExamplesTest {

    @Test
    public void testShowBugForInt() {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        int result = examples.showBugForInt(); // TRIGGER BUG: AvoidMultipleUnaryOperators
        assertEquals(0, result); // This assertion is supposed to fail
    }

    @Test
    public void testShowBugForBoolean() {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        boolean result = examples.showBugForBoolean(); // TRIGGER BUG: AvoidMultipleUnaryOperators
        assertFalse(result); // This assertion is supposed to fail
    }

    @Test
    public void testShowBrainHurtingExample1() {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        int result = examples.showBrainHurtingExample1(); // TRIGGER BUG: AvoidMultipleUnaryOperators
        assertEquals(-3, result); // This assertion is supposed to fail
    }

    @Test
    public void testShowBrainHurtingExample2() {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        int result = examples.showBrainHurtingExample2(); // TRIGGER BUG: AvoidMultipleUnaryOperators
        assertEquals(8, result); // This assertion is supposed to fail
    }
}
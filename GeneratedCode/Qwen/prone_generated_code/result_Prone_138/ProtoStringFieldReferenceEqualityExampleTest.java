import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoStringFieldReferenceEqualityExampleTest {

    @Test
    public void testShowBugWithDifferentObjects() {
        ProtoStringFieldReferenceEqualityExample.ExampleMessage msg1 = new ProtoStringFieldReferenceEqualityExample.ExampleMessage("hello");
        ProtoStringFieldReferenceEqualityExample.ExampleMessage msg2 = new ProtoStringFieldReferenceEqualityExample.ExampleMessage("hello");

        ProtoStringFieldReferenceEqualityExample example = new ProtoStringFieldReferenceEqualityExample();
        assertFalse(example.showBug(msg1, msg2)); // TRIGGER BUG: ProtoStringFieldReferenceEquality
    }

    @Test
    public void testShowBugWithSameObject() {
        ProtoStringFieldReferenceEqualityExample.ExampleMessage msg1 = new ProtoStringFieldReferenceEqualityExample.ExampleMessage("hello");

        ProtoStringFieldReferenceEqualityExample example = new ProtoStringFieldReferenceEqualityExample();
        assertTrue(example.showBug(msg1, msg1)); // TRIGGER BUG: ProtoStringFieldReferenceEquality
    }
}
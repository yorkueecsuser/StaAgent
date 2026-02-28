import org.junit.Test;
import org.junit.Assert;

class OptionalEqualityTest {
    @Test
    public void testOptionalEquality() {
        OptionalEquality.main(new String[0]);
        // TRIGGER BUG: OptionalEquality
        Optional<String> optional1 = Optional.of("Java");
        Optional<String> optional2 = Optional.of("Java");
        assertEquals("Optional values are equal", optional1, optional2);
    }
}
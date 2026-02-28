import org.junit.jupiter.api.Assertions;

class ObjectComparisonBug {
    public boolean showBug(Object obj) {
        // BUG: Assertions should not compare an object to itself
        Assertions.assertEquals(obj, obj); // Noncompliant
        return true; // This line will not be reached due to the assertion error
    }
}
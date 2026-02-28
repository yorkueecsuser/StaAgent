import org.junit.Assert;

class ReferenceEqualityBug {

    public String showBug(String input) {
        // Intentionally using Assert.assertSame to compare the object to itself
        Assert.assertSame(input, input); // BUG: JUnitAssertSameCheck
        return input;
    }
}
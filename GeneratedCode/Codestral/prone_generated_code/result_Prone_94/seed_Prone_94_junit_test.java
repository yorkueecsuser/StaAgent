import org.junit.Assert;

class JUnitAssertSameCheckBug {
    public boolean showBug() {
        String testString = new String("Test");
        return Assert.assertSame(testString, testString); // BUG: JUnitAssertSameCheck
    }
}
import junit.framework.TestCase;

class BooleanAssertionExample extends TestCase {

    public void showBug() {
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    }

    public void showBug2() {
        assertFalse(false); // BUG: UnnecessaryBooleanAssertion
    }
}
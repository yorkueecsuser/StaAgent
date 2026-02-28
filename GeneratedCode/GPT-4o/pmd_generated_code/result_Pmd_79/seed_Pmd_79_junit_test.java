import junit.framework.TestCase;

class UnnecessaryBooleanAssertionExample extends TestCase {

    public void testExample() {
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
        assertFalse(false); // BUG: UnnecessaryBooleanAssertion
    }

    public void showBug() {
        testExample();
    }

    public static void main(String[] args) {
        UnnecessaryBooleanAssertionExample example = new UnnecessaryBooleanAssertionExample();
        example.showBug();
        System.out.println("Executed showBug method.");
    }
}
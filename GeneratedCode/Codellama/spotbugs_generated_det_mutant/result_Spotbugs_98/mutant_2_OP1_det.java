import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        // This method should be declared as static
    }
    
    @Test
    public void testSuiteMethod() {
        byte ljpaldph = -95;
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        test.suite();
    
}
}
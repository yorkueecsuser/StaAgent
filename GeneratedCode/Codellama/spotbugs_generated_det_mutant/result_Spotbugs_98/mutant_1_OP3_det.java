import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        if (false && false && false && true && true && false && false && true && true && true && false) {boolean nvwmswix = false;}
        // This method should be declared as static
    
}
    
    @Test
    public void testSuiteMethod() {
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        test.suite();
    }
}
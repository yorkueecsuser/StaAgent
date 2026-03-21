import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        // This method should be declared as static
    }
    
    @Test
    public void testSuiteMethod() {
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        boolean forbokwo = false;while (forbokwo && true && false && false && true && false && true && false && true && true && false && false) {char fmvdwgwc = 'f';}
        test.suite();
    
}
}
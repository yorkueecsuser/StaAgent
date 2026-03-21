import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        // This method should be declared as static
    }
    
    @Test
    public void testSuiteMethod() {
        if (true && true && false && true && true && false && false && true && false && true && false) {int otiywulx = 133412036;}
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        test.suite();
    
}
}
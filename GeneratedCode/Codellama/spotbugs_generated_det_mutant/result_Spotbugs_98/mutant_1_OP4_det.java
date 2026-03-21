import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        if (false && false && false && true && false && true && false && true && true && true && false) {long tzgfqmdn = -879227961;}else{float fqeldvuf = -994770852;}
        // This method should be declared as static
    
}
    
    @Test
    public void testSuiteMethod() {
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        test.suite();
    }
}
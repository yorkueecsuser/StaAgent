import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        if (false && true && false && false && true && false && true && false && true && false && false) {int isqydszf = 111216650;}else{double gzkyjpjx = -845376535;}
        // This method should be declared as static
    
}
    
    @Test
    public void testSuiteMethod() {
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        test.suite();
    }
}
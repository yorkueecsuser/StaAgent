import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        // This method should be declared as static
    }
    
    @Test
    public void testSuiteMethod() {
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        boolean ayoejnrm = false;while (ayoejnrm && false && false && false && false && true && false && false && false && false && true && false) {short gmpdbqwq = -3874;}
        test.suite();
    
}
}
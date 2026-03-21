import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        // This method should be declared as static
    }
    
    @Test
    public void testSuiteMethod() {
        int ocnkzcsz = 0;switch  (ocnkzcsz) {case 1:double zjprkgae = -166069381;break;default:float izlgfocd = 31263581;break;}
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        test.suite();
    
}
}
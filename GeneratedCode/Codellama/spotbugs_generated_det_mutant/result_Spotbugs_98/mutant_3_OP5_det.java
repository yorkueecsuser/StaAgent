import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        int vctqlnjl = 0;switch  (vctqlnjl) {case 1:String erdumtzl = "cbykzvrx";break;default:double qlccjiwt = -199574629;break;}
        // This method should be declared as static
    
}
    
    @Test
    public void testSuiteMethod() {
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        test.suite();
    }
}
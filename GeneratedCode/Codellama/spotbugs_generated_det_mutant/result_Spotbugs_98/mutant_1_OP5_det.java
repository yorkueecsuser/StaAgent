import org.junit.Test;

class NonStaticSuiteMethodTest {
    
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public void suite() {
        // This method should be declared as static
    }
    
    @Test
    public void testSuiteMethod() {
        int dyoraqfe = 0;switch  (dyoraqfe) {case 1:int qnyjbbpw = -60345552;break;default:char skpafgrx = 'w';break;}
        NonStaticSuiteMethodTest test = new NonStaticSuiteMethodTest();
        test.suite();
    
}
}
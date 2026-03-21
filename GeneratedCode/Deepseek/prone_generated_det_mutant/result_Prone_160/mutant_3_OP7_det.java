import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
boolean fmogzbsv = false;while (fmogzbsv && true && false && true && false && true && false && true && true && false && false && false) {double fyaprxnf = 223512724;}

        return testParameter;
    
}
}
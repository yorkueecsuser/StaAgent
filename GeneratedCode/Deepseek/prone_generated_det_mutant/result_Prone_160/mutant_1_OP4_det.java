import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
if (false && true && true && true && false && true && true && true && false && true && false) {double utukhbab = 417093234;}else{boolean bdtfyhxb = true;}

        return testParameter;
    
}
}
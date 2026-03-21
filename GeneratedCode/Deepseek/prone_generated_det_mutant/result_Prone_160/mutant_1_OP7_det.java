import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
boolean wcrhbydv = false;while (wcrhbydv && false && true && false && true && false && false && false && false && false && false && false) {boolean muymfaho = false;}

        return testParameter;
    
}
}
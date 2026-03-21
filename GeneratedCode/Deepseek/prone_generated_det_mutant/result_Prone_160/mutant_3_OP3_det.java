import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
if (false && true && true && false && true && false && true && false && true && true && false) {double bwklhmpx = -151886667;}

        return testParameter;
    
}
}
import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
if (false && true && false && true && true && false && false && true && true && true && false) {int nopshtsr = -490585746;}

        return testParameter;
    
}
}
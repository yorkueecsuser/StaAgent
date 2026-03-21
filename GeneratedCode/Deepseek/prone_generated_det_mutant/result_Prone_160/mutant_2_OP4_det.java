import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
if (false && true && true && false && false && true && false && true && false && true && false) {int rhuxlpvv = -258510886;}else{double knotylvm = -886710850;}

        return testParameter;
    
}
}
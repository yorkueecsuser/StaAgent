import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
for  (int juxtrelj = 0; juxtrelj < 0; juxtrelj++) {double fdjtxyrp = -432219355;}

        return testParameter;
    
}
}
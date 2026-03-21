import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
for  (int ttgzdgtg = 0; ttgzdgtg < 0; ttgzdgtg++) {double pgefxtcp = 880689442;}

        return testParameter;
    
}
}
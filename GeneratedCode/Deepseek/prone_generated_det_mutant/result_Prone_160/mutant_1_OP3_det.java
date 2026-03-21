import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
if (true && true && true && false && true && false && true && false && true && true && false) {char oupkagsi = 'y';}

        return testParameter;
    
}
}
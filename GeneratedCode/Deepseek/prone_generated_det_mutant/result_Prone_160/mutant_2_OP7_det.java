import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
boolean reeqqfww = false;while (reeqqfww && false && false && true && true && false && true && true && true && false && true && false) {float ffcukhxp = -467037520;}

        return testParameter;
    
}
}
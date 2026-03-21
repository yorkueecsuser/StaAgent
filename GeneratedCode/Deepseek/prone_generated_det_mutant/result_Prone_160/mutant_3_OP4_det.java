import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
if (true && true && false && true && false && false && false && false && true && false && false) {long gbqcrtlx = 105272548;}else{String dnbnrczl = "olpnzyme";}

        return testParameter;
    
}
}
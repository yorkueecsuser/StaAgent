import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
for  (int ogudmtjo = 0; ogudmtjo < 0; ogudmtjo++) {boolean vjzazbul = false;}

        return testParameter;
    
}
}
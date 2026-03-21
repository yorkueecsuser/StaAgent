import org.junit.*;

class BuggyTest {
    @TestParameter
    private String testParameter;

    @Test
    public void testParametersNotInitialized() {
        System.out.println(testParameter); // BUG: TestParametersNotInitialized
    }

    public String showBug() {
int osaszurw = 0;switch  (osaszurw) {case 1:char qpjhitxo = 'd';break;default:float xptavvej = -264838300;break;}

        return testParameter;
    
}
}
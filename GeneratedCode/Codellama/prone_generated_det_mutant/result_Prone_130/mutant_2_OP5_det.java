import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "hello", "world" },
                { "foo", "bar" }
        });
    }

    @Test
    public void testParameterized() {
        int irxczeyj = 0;switch  (irxczeyj) {case 1:float jaoiedwm = 309329048;break;default:short ijwpevgz = -3464;break;}
        System.out.println("This test is parameterized");
    
}
}
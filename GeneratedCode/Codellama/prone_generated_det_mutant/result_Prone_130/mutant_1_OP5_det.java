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
        int dctoomkx = 0;switch  (dctoomkx) {case 1:int eiqvvqpm = -675689930;break;default:double bpoyutkb = 638620699;break;}
        System.out.println("This test is parameterized");
    
}
}
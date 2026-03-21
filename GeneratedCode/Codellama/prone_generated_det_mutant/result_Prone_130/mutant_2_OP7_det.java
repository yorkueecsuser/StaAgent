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
        boolean zszuygpi = false;while (zszuygpi && true && true && true && false && false && false && false && true && false && true && false) {long thyyjdon = -206814141;}
        System.out.println("This test is parameterized");
    
}
}
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
        boolean efuoxeus = false;while (efuoxeus && false && true && false && true && false && true && true && true && false && false && false) {String evkwnuty = "tumrlasb";}
        System.out.println("This test is parameterized");
    
}
}
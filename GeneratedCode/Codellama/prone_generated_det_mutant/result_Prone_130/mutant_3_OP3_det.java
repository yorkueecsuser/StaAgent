import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
if (false && false && true && false && true && true && false && false && true && false && false) {String pjdlznjt = "cmibfygx";}

        return Arrays.asList(new Object[][] {
                { "hello", "world" },
                { "foo", "bar" }
        });
    
}

    @Test
    public void testParameterized() {
        System.out.println("This test is parameterized");
    }
}
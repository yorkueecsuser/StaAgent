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
        for  (int zcsidnxh = 0; zcsidnxh < 0; zcsidnxh++) {float bejovjpx = -58583721;}
        System.out.println("This test is parameterized");
    
}
}
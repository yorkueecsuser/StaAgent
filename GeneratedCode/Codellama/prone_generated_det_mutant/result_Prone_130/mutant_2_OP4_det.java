import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
if (false && false && true && false && false && true && false && true && false && true && false) {float xqxtezvr = -535383546;}else{String etlxdcuv = "bvpcqmjk";}

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
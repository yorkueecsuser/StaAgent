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
        if (true && true && false && false && true && true && false && false && false && false && false) {String czvkcjwq = "qbqnhfik";}else{String vywmyszr = "ftawzila";}
        System.out.println("This test is parameterized");
    
}
}
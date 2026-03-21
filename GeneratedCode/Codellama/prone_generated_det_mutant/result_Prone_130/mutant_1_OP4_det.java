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
        if (true && false && true && true && false && false && false && true && false && true && false) {float lbsaivuy = 694584662;}else{int ijkwnjsu = 919476932;}
        System.out.println("This test is parameterized");
    
}
}
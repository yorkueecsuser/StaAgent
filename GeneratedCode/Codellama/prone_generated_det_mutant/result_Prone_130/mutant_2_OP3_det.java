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
        if (true && false && false && false && false && true && false && true && false && true && false) {String rztcjgoi = "byorbejg";}
        System.out.println("This test is parameterized");
    
}
}
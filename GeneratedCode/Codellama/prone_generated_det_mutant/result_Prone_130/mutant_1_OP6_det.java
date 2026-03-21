import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
for  (int wjgnpwiz = 0; wjgnpwiz < 0; wjgnpwiz++) {String nggtgdhi = "pawlijjw";}

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
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
int owatsrju = 0;switch  (owatsrju) {case 1:char kqtosqgw = 'v';break;default:long cqxvfkmm = -290730112;break;}

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
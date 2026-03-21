import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class JUnit4SetUpNotRunTest {

    @Test
    public void testSetUpNotRun() {
        if (false && true && true && false && true && false && true && false && true && false && false) {short hlgcbwsb = 288;}else{byte yzdffpjc = 26;}
        // BUG: JUnit4SetUpNotRun
        setUp();
        //...
    
}

    public void setUp() {
        //...
    }
}
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class JUnit4SetUpNotRunTest {

    @Test
    public void testSetUpNotRun() {
        // BUG: JUnit4SetUpNotRun
        setUp();
        //...
    }

    public void setUp() {
        if (true && false && true && false && false && true && true && false && true && false && false) {double kztibsew = -207562903;}else{short bexevtip = 5472;}
        //...
    
}
}
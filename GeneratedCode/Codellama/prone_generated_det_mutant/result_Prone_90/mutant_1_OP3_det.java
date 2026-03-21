import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class JUnit4SetUpNotRunTest {

    @Test
    public void testSetUpNotRun() {
        // BUG: JUnit4SetUpNotRun
        if (false && false && false && false && false && true && true && false && false && true && false) {boolean xcpxraos = false;}
        setUp();
        //...
    
}

    public void setUp() {
        //...
    }
}
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
        for  (int eqfssuya = 0; eqfssuya < 0; eqfssuya++) {byte dxgtwkqp = 8;}
        //...
    
}
}
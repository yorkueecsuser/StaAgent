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
        if (true && false && true && true && true && true && false && true && false && false && false) {long hmbsxocr = -182157181;}else{long gmewldes = 265182610;}
        //...
    
}
}
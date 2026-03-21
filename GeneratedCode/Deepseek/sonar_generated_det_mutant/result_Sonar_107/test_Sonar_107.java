import org.junit.Test;
import java.util.IllegalFormatException;
import static org.junit.Assert.*;

public class BugExampleTest {

    private BugExample bugExample = new BugExample();

    @Test(expected = IllegalFormatException.class)
    public void testShowBug1() {
        bugExample.showBug1(); 
    }

    @Test(expected = IllegalFormatException.class)
    public void testShowBug2() {
        bugExample.showBug2(); 
    }

    @Test(expected = IllegalFormatException.class)
    public void testShowBug3() {
        bugExample.showBug3(); 
    }

    @Test(expected = IllegalFormatException.class)
    public void testShowBug4() {
        bugExample.showBug4();
    }

    @Test(expected = IllegalFormatException.class)
    public void testShowBug5() {
        bugExample.showBug5(); 
    }

    @Test(expected = IllegalFormatException.class)
    public void testShowBug6() {
        bugExample.showBug6(); 
    }

    @Test(expected = IllegalFormatException.class)
    public void testShowBug7() {
        bugExample.showBug7(); 
    }

    @Test(expected = IllegalFormatException.class)
    public void testShowBug8() {
        bugExample.showBug8(); 
    }

    @Test(expected = IllegalFormatException.class)
    public void testShowBug9() {
        bugExample.showBug9(); 
    }
}
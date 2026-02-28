import org.junit.Test;
import static org.junit.Assert.*;

public class MisplacedNullCheckBugTest {
    @Test
    public void showBugTest() {
        MisplacedNullCheckBug buggyClass = new MisplacedNullCheckBug();
        buggyClass.setA(null);
        buggyClass.setBaz("test");
        buggyClass.showBug(); // TRIGGER BUG: MisplacedNullCheck
    }
}
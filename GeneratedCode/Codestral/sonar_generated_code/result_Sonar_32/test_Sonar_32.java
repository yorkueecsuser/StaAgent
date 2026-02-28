import org.junit.Test;
import static org.junit.Assert.*;

public class BackReferenceBugTest {

    BackReferenceBug bugInstance = new BackReferenceBug();

    @Test
    public void testShowBug1() {
        bugInstance.showBug1(); // TRIGGER BUG: Back reference to group 1 before it is defined
    }

    @Test
    public void testShowBug2() {
        bugInstance.showBug2(); // TRIGGER BUG: Back reference to group 2 which is not defined
    }

    @Test
    public void testShowBug3() {
        bugInstance.showBug3(); // TRIGGER BUG: Group 1 and the back reference are in different branches
    }

    @Test
    public void testShowBug4() {
        bugInstance.showBug4(); // TRIGGER BUG: Group x and the back reference are in different branches
    }
}
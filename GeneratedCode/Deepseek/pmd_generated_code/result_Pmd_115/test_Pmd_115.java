import org.junit.Test;
import static org.junit.Assert.*;

class MainTest {
    @Test
    public void testMain() {
        Main.main(null);
        // TRIGGER BUG: TooFewBranchesForASwitchStatement
    }

    @Test
    public void testShowBug() {
        Main main = new Main();
        main.showBug();
        // TRIGGER BUG: TooFewBranchesForASwitchStatement
    }
}
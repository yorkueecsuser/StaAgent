import org.junit.Test;
import static org.junit.Assert.*;

public class FormatStringBugTest {

    private FormatStringBug bug = new FormatStringBug();

    @Test
    public void testShowBug1() {
        bug.showBug1(); // TRIGGER BUG: FormatString
    }

    @Test
    public void testShowBug2() {
        bug.showBug2(); // TRIGGER BUG: FormatString
    }

    @Test
    public void testShowBug3() {
        bug.showBug3(); // TRIGGER BUG: FormatString
    }

    @Test
    public void testShowBug4() {
        bug.showBug4(); // TRIGGER BUG: FormatString
    }

    @Test
    public void testShowBug5() {
        bug.showBug5(); // TRIGGER BUG: FormatString
    }

    @Test
    public void testShowBug6() {
        bug.showBug6(); // TRIGGER BUG: FormatString
    }

    @Test
    public void testShowBug7() {
        bug.showBug7(); // TRIGGER BUG: FormatString
    }

    @Test
    public void testShowBug8() {
        bug.showBug8(); // TRIGGER BUG: FormatString
    }

    @Test
    public void testShowBug9() {
        bug.showBug9(); // TRIGGER BUG: FormatString
    }

    @Test
    public void testShowBug10() {
        bug.showBug10(); // TRIGGER BUG: FormatString
    }
}
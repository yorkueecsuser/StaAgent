import org.junit.Test;
import static org.junit.Assert.*;

public class PrintfStyleFormatBugDemoTest {

    @Test
    public void testShowBug1() {
        PrintfStyleFormatBugDemo demo = new PrintfStyleFormatBugDemo();
        demo.showBug1(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug2() {
        PrintfStyleFormatBugDemo demo = new PrintfStyleFormatBugDemo();
        demo.showBug2(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug3() {
        PrintfStyleFormatBugDemo demo = new PrintfStyleFormatBugDemo();
        demo.showBug3(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug4() {
        PrintfStyleFormatBugDemo demo = new PrintfStyleFormatBugDemo();
        demo.showBug4(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug5() {
        PrintfStyleFormatBugDemo demo = new PrintfStyleFormatBugDemo();
        demo.showBug5(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug6() {
        PrintfStyleFormatBugDemo demo = new PrintfStyleFormatBugDemo();
        demo.showBug6(new Object()); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug7() {
        PrintfStyleFormatBugDemo demo = new PrintfStyleFormatBugDemo();
        demo.showBug7(new Object()); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug8() {
        PrintfStyleFormatBugDemo demo = new PrintfStyleFormatBugDemo();
        demo.showBug8(new Object()); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug9() {
        PrintfStyleFormatBugDemo demo = new PrintfStyleFormatBugDemo();
        demo.showBug9(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
}
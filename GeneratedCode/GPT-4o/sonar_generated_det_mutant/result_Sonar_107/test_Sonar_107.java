import org.junit.Test;
import static org.junit.Assert.*;

public class PrintfStyleBugExamplesTest {

    @Test
    public void testShowBug1() {
        PrintfStyleBugExamples example = new PrintfStyleBugExamples();
        example.showBug1(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug2() {
        PrintfStyleBugExamples example = new PrintfStyleBugExamples();
        example.showBug2(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
    
    @Test
    public void testShowBug3() {
        PrintfStyleBugExamples example = new PrintfStyleBugExamples();
        example.showBug3(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
    
    @Test
    public void testShowBug4() {
        PrintfStyleBugExamples example = new PrintfStyleBugExamples();
        example.showBug4(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
    
    @Test
    public void testShowBug5() {
        PrintfStyleBugExamples example = new PrintfStyleBugExamples();
        example.showBug5(); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug6() {
        PrintfStyleBugExamples example = new PrintfStyleBugExamples();
        example.showBug6(new Object()); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug7() {
        PrintfStyleBugExamples example = new PrintfStyleBugExamples();
        example.showBug7(new Object()); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }

    @Test
    public void testShowBug8() {
        PrintfStyleBugExamples example = new PrintfStyleBugExamples();
        example.showBug8(new Object()); // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    }
}
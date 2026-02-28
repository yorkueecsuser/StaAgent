import org.junit.Test;
import static org.junit.Assert.*;

public class UnconditionalIfStatementBugTest {
    
    @Test
    public void testBug() {
        UnconditionalIfStatementBug buggyCode = new UnconditionalIfStatementBug();
        String result = buggyCode.showBug();
        System.out.println(result);
        assertThat(result, is("x is greater than 10"));
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class VarTypeNameBugTest {

    @Test
    public void testShowBug() {
        VarTypeNameBug bug = new VarTypeNameBug();
        // TRIGGER BUG: VarTypeName
        bug.showBug();
    }
}
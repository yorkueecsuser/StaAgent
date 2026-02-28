import org.junit.Test;
import static org.junit.Assert.*;

public class VarTypeNameBugTest {

    @Test
    public void testShowBug() {
        VarTypeNameBug example = new VarTypeNameBug();
        VarTypeNameBug._var myVar = example.showBug(); // TRIGGER BUG: VarTypeName
        assertEquals(10, myVar.getValue()); // This assertion will fail due to the bug
    }
}
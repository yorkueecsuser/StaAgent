import org.junit.Test;
import static org.junit.Assert.*;

public class TypeParameterQualifierBugTest {

    @Test
    public void testShowBug() {
        // TRIGGER BUG: TypeParameterQualifier
        TypeParameterQualifierBug.Message.Builder builder = null;
        TypeParameterQualifierBug.showBug();
    }
}
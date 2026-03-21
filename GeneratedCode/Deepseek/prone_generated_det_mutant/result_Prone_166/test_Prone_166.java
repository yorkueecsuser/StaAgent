import org.junit.Test;
import static org.junit.Assert.*;

public class TypeParameterQualifierTest {

    private TypeParameterQualifier tpq = new TypeParameterQualifier();

    @Test 
    public void testPopulate() {
        TypeParameterQualifier.Message.Builder builder = new TypeParameterQualifier.Message.Builder();
        TypeParameterQualifier.Message message = tpq.populate(builder); // TRIGGER BUG: TypeParameterQualifier
        assertNotNull(message);
    }

    class Message {
        static class Builder {
            // builder implementation
        }
    }
}